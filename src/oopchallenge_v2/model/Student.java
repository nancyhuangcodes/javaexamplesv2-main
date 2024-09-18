package oopchallenge_v2.model;

import oopchallenge_v2.model.Course;

import java.util.ArrayList;

public class Student {
    // attributes for the student
    String firstName;       // first name
    String lastName;        // last name
    boolean registration;   // registration
    int grade;              // grade
    int year;               // year
    String id;              // id
    ArrayList<Course> enrolledCourses = new ArrayList<>();  // student's enrolled courses

    public Student(String firstName,                        // OVERLOADED constructor to create an instance of a student
                   String lastName,
                   boolean registration,
                   int grade,
                   int year,
                   String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
        this.id = id;
    }

    public Student(String firstName,                        // OVERLOADED constructor to create an instance of a student
                   String lastName,
                   int grade,
                   String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = 1;                                     // new students start from year 1
        this.registration = true;                          // set the registration to true
        this.grade = grade;
        this.id = id;
    }

    public Student() {                                     // default construct
        this.firstName = "";
        this.lastName = "";
        this.registration = false;
        this.grade = 0;
        this.year = 1;
        this.id = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean enrollCourse(Course course){
        return enrolledCourses.add(course);
    }

    public boolean unEnrolCourse(Course course){
        return enrolledCourses.remove(course);
    }

    public int totalEnrolledCourses(){
        return enrolledCourses.size();
    }

    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public ArrayList<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    @Override                                              // Overriding the default toString() method
    public String toString(){                              // of a java class
        return "Student{'" +
                "firstName':'" +
                firstName + "', '" +
                "lastName':'" +
                lastName + "', '" +
                "grade':" +
                grade + ", '" +
                "year':" +
                year + ", '" +
                "registration':" +
                registration + ", '" +
                "id':'" +
                id + "'}";
    }
}
