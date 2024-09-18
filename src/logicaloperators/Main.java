package logicaloperators;

import logicaloperators.grader.Grader;
import logicaloperators.utils.PrinterHelper;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        char option;
        int grade;
        Scanner scanner = new Scanner(System.in);

        // Wait for the user inputs to continue with the program
        do {

            // Show the main menu when the program runs using method showMainMenu()
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);

            if(option != 'a'){          // if value entered is not 'a', continue
                continue;
            }
            else if(option == 'b'){     // break out of the loop (end the program)
                break;
            }

            // Ask for the grade to be keyed in using the method showGradeMenu()
            PrinterHelper.showGradeMenu();
            grade = scanner.nextInt();

            // Create an instance to pass in the grade and print results
            Grader grader = new Grader(grade);
            PrinterHelper.showGradeFeedback(grader.showGrade());

            exit(0);

        }while (option != 'b');

    }
}
