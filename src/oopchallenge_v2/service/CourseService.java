package oopchallenge_v2.service;

import oopchallenge_v2.model.Student;
import oopchallenge_v2.model.Course;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseService {

    // attribute students as a Hashmap of students <id, Student>
    HashMap<String, Student> students = new HashMap<>(); // students

    // attribute courses as a Hashmap of courses <id, Course>
    HashMap<String, Course> courses = new HashMap<>();    // courses

    // Static Variable for the Course System
    static final int yearIncorporated = 1999;

    // constructor to initialise our values for students and courses
    public CourseService() {
        // create HashMap of Students upon instantiating CourseService
        students.put("120120", new Student("Santiago", "Andres", 10 ,"120120"));
        students.put( "884545", new Student( "Kate", "Smith", 50 ,"884545" ));
        students.put( "458787", new Student( "Alejandra", "Thomas", 5, "458787" ));
        students.put( "135464", new Student( "Maria", "Simpson", 99 ,"135464" ));
        students.put( "778979", new Student("Peter", "Thomas", true, 0, 2,"778979"));

        // create HashMap of Courses upon instantiating CourseService
        courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudents(Student[] students){
        //TODO add all the students to the collection in courseService
        for (Student student: students) {
            this.students.put(student.getId(), student);
        }

        this.students.forEach((studentId, student)-> System.out.println(student));
    }

    public boolean enrollStudent(String studentId, String courseId){
        // TODO enrol a student to a course
        // TODO 1. create an instance of student
        // TODO 2. create an instance of course
        // TODO 3. enrol returned student to course
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if(course == null)
            return false;

        return student.enrollCourse(course);
    }

    public boolean unEnrollStudent(String studentId, String courseId){
        // TODO 1. obtain the student by its id
        // TODO 2. obtain the course by its id
        // TODO 3. un-enrol a student from a course
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if(course == null)
            return false;

        return student.unEnrolCourse(course);
    }

    public void displayCourseInformation(String courseId){
        // TODO printout course information
        System.out.println(courses.get(courseId));
    }

    public void displayStudentInformation(String studentId){
        // TODO printout student information
        System.out.println(students.get(studentId));
    }

    public Student getStudent(String studentId){
        // TODO return a student by its id
        return students.get(studentId);
    }

    public void displayStudentCourseInformation(String studentId){
        // TODO get the student and print the student's enrolled courses
        // TODO 1. create instance of student
        // TODO 2. call the student's method getEnrolledCourses()
        Student student = students.get(studentId);

        if(student == null)
            System.out.println("Student Not Found.");

        ArrayList<Course> results = null;
        if (student != null) {
            results = student.getEnrolledCourses();
        }

        if (student != null) {
            System.out.println("Student ID " + student.getId() + " enrolled into:");
        }
        if (results != null) {
            results.forEach(result-> System.out.println("\t" + result));
        }
    }

    public void displayTotalStudentCredits(String studentId){
        // TODO 1. create an instance of the student
        // TODO 2. create an instance to get all courses belonging to the student
        // TODO 3. create LOCAL variable 'total' to add up all the course credits
        // TODO 4. add up the total credits from each course (via for-each loop)
        Student student = students.get(studentId);

        // TODO 5. If studentId does not exist, print feedback and return
        if(student == null) {
            System.out.println("Student Not Found.");
            return;
        }

        ArrayList<Course> enrolledCourses = student.getEnrolledCourses();

        int total = 0;
        for (Course course: enrolledCourses) {
            total += course.getCredit();
        }

        System.out.println("Total credits for " +
                student.getId() + ": " +
                total);
    }

    public int countStudents(){
        return students.size();
    }

    public void displayStudentEnrollments(String courseId){
        // TODO 1. get enrolled students
        // TODO 2. get the course by courseId
        ArrayList<Student> enrolledStudents = new ArrayList<>();
        Course enquiredCourse = courses.get(courseId);

        // TODO 3. loop through each student to find if enrolled into enquiredCourse
        // TODO 3.1 store each student who took enquiredCourse to ArrayList enrolledStudents
        students.forEach((studentId, student)->{
            ArrayList<Course> enrolledCourses = student.getEnrolledCourses();
            for (Course course: enrolledCourses) {
                if(course.getId().equals(enquiredCourse.getId())){
                    enrolledStudents.add(student);
                }
            }
        });

        // TODO 4: print out the list of students who took the enquiredCourse
        System.out.println("Enrolled students for course: " + enquiredCourse.getName());
        System.out.println("********************");

        // TODO 5: loop and print out the student(s) names taking enquiredCourse
        // enrolledStudents.forEach(student -> System.out.println(student));
        for (Student student: enrolledStudents) {
            System.out.println(student);
        }

    }

    public static void WelcomeStatement(){
        System.out.println("Hello to Generation Course System");
        System.out.println("*********************************");
    }

    public static void PrintYearIncorporated(){
        System.out.println("This program was incorporated in the year: " + yearIncorporated);
        System.out.println("**************************************************************");
    }
}
