package java_assessment.service;

import java_assessment.model.Course;
import java_assessment.model.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public StudentService() {
        subscribeStudent( new Student( "Adrian", "Tan", "adriantan@gmail.com", new Date(101,0,17),"stu01"));        // 2001 Jan 17
        subscribeStudent( new Student( "Goh", "Hui Xin", "gohhuixin@hotmail.com", new Date(102,8,4), "stu02") );    // 2002 Sep 4
        subscribeStudent( new Student( "Alex", "Lim", "alexlim@gmail.com", new Date(103,4,30), "stu03") );          // 2003 May 30
    }

    public void subscribeStudent( Student student ) {
        students.put( student.getId(), student );
    }

    public Student findStudent(String studentId ) {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }
    public Course findStudentCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        if (student != null) {
            for (Course course : student.getEnrolledCourses()) {
                if (course.getCourseId().equals(courseId)) {
                    return course;
                }
            }
        }
        return null;
    }

    public void updateGrade(String studentId, String Id, double grade) {
        Student student = findStudent(studentId);
        if (student != null) {
            for (Course course : student.getEnrolledCourses()) {
                if (course.getId().equals(Id)) {
                    course.setGrade(grade); //
                    break;
                }
            }
        }
    }


    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        // TODO implement
        // TODO 1. display a title for this feature
        // TODO 2. list each student AND the course(s) the student is enrolled into approvedCourses
        System.out.println("Students and the courses enrolled into:");
        for (String key : students.keySet()){
            Student student = students.get(key);
            student.printFullName();

            List<Course> courses = student.getApprovedCourses();

            if (courses == null) {
                System.out.println("\t\t No enrolled courses");
            } else {
                for (Course course : courses){
                    System.out.println("\t\t" + course);
                }
            }

        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}