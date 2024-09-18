package oopchallenge_v2;

import oopchallenge.model.Course;
import oopchallenge_v2.model.Student;
import oopchallenge_v2.service.CourseService;

public class Main {

    public static void main(String[] args) throws Exception {

        // TODO create an instance of CourseService
        CourseService courseService = new CourseService();

        String courseId = "biol_01";
        String courseId2 = "phys_01";
        String courseId3 = "art_01";
        String courseIdFake = "piano_01";
        String studentId = "120120";
        String studentId2 = "884545";

        // TODO call static methods from CourseService, printing basic info.
        CourseService.WelcomeStatement();
        CourseService.PrintYearIncorporated();

        // TODO check for course information
        courseService.displayCourseInformation(courseId);
        courseService.displayCourseInformation(courseId2);
        courseService.displayCourseInformation(courseId3);

        // TODO check for student information
        courseService.displayStudentInformation(studentId);

        // TODO get a student by the studentId and print the full name
        Student student = courseService.getStudent(studentId);
        if(student != null)
            student.printFullName();

        // TODO get the student from CourseService and enrol the student to the courseId
        boolean enrolBio = courseService.enrollStudent(student.getId(), courseId);
        System.out.println(
                student.getFirstName() + " " +
                student.getLastName() + " " +
                "enrolled into " +
                        courseId + ": " +
                        enrolBio );

        // TODO get the student from CourseService and un-enrol student
        boolean unEnrolBio = courseService.unEnrollStudent(student.getId(), courseIdFake);
        System.out.println(
                student.getFirstName() + " " +
                student.getLastName() + " " +
                "UN-enrolled from " +
                    courseIdFake + ": " +
                    unEnrolBio );

        // TODO studentId2 will be enrolled to courseId, courseId2 and courseId3
        // TODO display all courses attended by studentId2
        courseService.enrollStudent(studentId2, courseId);
        courseService.enrollStudent(studentId2, courseId2);
        courseService.enrollStudent(studentId2, courseId3);
        courseService.displayStudentCourseInformation(studentId2);
        courseService.displayTotalStudentCredits(studentId2);

        // TODO provide the total count of students within courseService
        int totalStudents = courseService.countStudents();
        System.out.println("\nTotal student count is: " + totalStudents);

        // TODO display student(s) enrolled into a course by its Id
        courseService.displayStudentEnrollments(courseId);

        // TODO create a array of students to be stored
        Student[] newStudents = {
                new Student("Colin", "Toh", 10 ,"121121"),
                new Student("Charlie", "Tan", 10 ,"122122"),
        };

        courseService.enrollStudents(newStudents);
    }
}
