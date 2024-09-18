package java_assessment.model;

import java_assessment.model.Course;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    // attributes for the student
    String firstName;       // first name
    String lastName;        // last name
    String email;           // email
    Date birthDate;         // DOB
    int grade;              // grade
    String id;              // id

     ArrayList<Course> enrolledCourses = new ArrayList<>();  // student's enrolled courses

    public Student(String firstName,                        // constructor to create an instance of a student
                   String lastName,
                   String email,
                   Date birthDate,
                   String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.grade = 0;
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean enrollToCourse(Course course){
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
                "email':" +
                email + ", '" +
                "birth date':" +
                birthDate + ", '" +
                "id':'" +
                id + "'}";
    }
}
