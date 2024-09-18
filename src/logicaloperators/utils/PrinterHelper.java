package logicaloperators.utils;

public class PrinterHelper {
    public static void showMainMenu() {
        System.out.println("*--- ::Check your grade::  ---*");
        System.out.println("*--- Select an option:     ---*");
        System.out.println("*--- a. Enter a grade      ---*");
        System.out.println("*--- b. Exit Program       ---*");
        System.out.println("*******************************");
    }

    public static void showGradeMenu(){
        System.out.println("*--- Enter a grade:        ---*");
    }

    public static void showGradeFeedback(String feedback){
        System.out.println("*--- Grade result:         ---*");
        System.out.println(feedback);
    }
}
