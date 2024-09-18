package intro;

import java.util.Scanner;

public class MyFirstInput {

    public static void main(String[] args) {                    // start point of the program intro.MyFirstInput

        Scanner scanner = new Scanner(System.in);               // Create a scanner object
        System.out.println("Please enter your good name: ");
        String name = scanner.nextLine();                       // Read input from user

        System.out.println("Your name is: " + name);            // Print out the name
    }
}
