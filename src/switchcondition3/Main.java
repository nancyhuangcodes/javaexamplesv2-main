package switchcondition3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int purchase;
        int discount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your purchase quantity: ");
        purchase = scanner.nextInt();

        System.out.println("Please enter your discount: ");
        discount = scanner.nextInt();

        switch (discount){
            case 20:                                                        // discount at 20%
                if(purchase > 5)
                    System.out.println("You have a discount of 25%.");      // add 5% more for > 5 purchases
                else
                    System.out.println("You have a discount of 20%.");
                break;
            case 30:                                                        // discount at 30%
                if(purchase > 5)
                    System.out.println("You have a discount of 35%.");      // add 5% more for > 5 purchases
                else
                    System.out.println("You have a discount of 30%.");
                break;
            default:                                                        // catch all
                    System.out.println("Invalid discount");
                    break;
        }
    }
}
