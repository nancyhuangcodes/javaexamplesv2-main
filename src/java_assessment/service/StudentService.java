package java_assessment.service;


import java_assessment.model.Course;
import java_assessment.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return false;
    }

    public void showSummary()
    {
        //TODO implement
        students.forEach((id, student)-> System.out.println(student));
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }

}
