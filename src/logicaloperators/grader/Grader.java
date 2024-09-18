package logicaloperators.grader;

public class Grader {

    int grade;

    public Grader(int grade) {
        this.grade = grade;
    }

    public String showGrade(){

        String feedback = "";

        if(this.grade >= 0 && this.grade <= 3)          // Failed if they scored 3 or less
            feedback = "Failed\n";
        else if(this.grade > 3 && this.grade <= 5)      // Insufficient if they scored > 3 but less than 5. (5 included)
            feedback = "Insufficient\n";
        else if(this.grade > 5 && this.grade <= 8)      // Good if they scored > 5 but less than 8. (8 included)
            feedback = "Good\n";
        else if(this.grade == 9 || this.grade == 10)    // Excellent Grade if they scored 10.
            feedback = "Excellent Grade\n";
        else                                            // if participants enter a negative number or a number outside the range supported (outside 0 - 10)
            feedback = "Invalid Entry\n";

        return feedback;
    }
}
