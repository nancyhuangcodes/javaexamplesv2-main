package switchcondition2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the day of the week:");
        day = scanner.nextLine();

        switch (day.toLowerCase()){
            case "monday":
                System.out.println("Monday Blues!");
                break;
            case "tuesday", "wednesday", "thursday", "friday", "saturday":
                System.out.println("Hurrah!");
                break;
            default:
                System.out.println("Every day is a sunday!");
        }

    }
}
