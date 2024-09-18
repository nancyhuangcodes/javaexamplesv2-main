package switchcondition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        input = scanner.nextInt();

        switch (input){
            case 0:
                System.out.println("is 0");
                break;
            case 1:
                System.out.println("is 1");
                break;
            case 2:
            case 3:
                System.out.println("is 2 or 3");
                System.out.println("Actual input is " + input);
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}
