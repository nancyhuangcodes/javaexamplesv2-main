package oopchallenge;

import oopchallenge.model.Course;
import oopchallenge.model.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
                "John",
                "Doe",
                2,
                1,
                "001"
        );

        System.out.println(student1);

        Course courseJava = new Course(
                "Java",
                "J1",
                5
        );

        System.out.println(courseJava);
        student1.enrollCourse(courseJava);

        System.out.println("Total courses: " + student1.totalEnrolledCourses());
    }
}
