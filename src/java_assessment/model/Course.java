package java_assessment.model;

public class Course {

    // attributes for the Course
    String name;    // name
    String id;      // id
    double grade;     // grades
    private String courseName;

    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.grade = getGrade();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter and setter for courseName
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter and setter for grade
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override                       // OVERRIDE the default toString() method
    public String toString() {      // for a Java class
        return "Course{'" +
                "name':'" +
                name + "'," +
                "'id':'" +
                id + "'," +
                "'grade':" +
                grade + "}";
    }

    public Object getCourseId() {
        return null;
    }
}
