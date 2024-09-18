package loops;

public class Breakcontinue {

    public static void main(String[] args) {

        // Use a break keyword in a for loop
//        for (int i = 0; i < 10; i++) {
//            if(i == 3)                      // if i == 3
//                break;                      // break out of the loop
//            System.out.println(i);
//        }

        // Use a break keyword to exist a while loop
//        int count = 0;
//        while (count < 10){
//            if(count == 3)                  // break out of while loop if count is == 3
//                break;
//            System.out.println(count);
//            count++;                        // without this stepper, the loop will be infinite =(
//        }
//
        // Use a continue keyword to skip one iteration of a loop
        for (int i = 0; i < 10; i++) {
            if(i == 3)                      // skip the iteration if i == 3
                continue;
            System.out.println(i);
        }

        // Write the above statement in a while loop instead
        int i = 0;
        while (i < 10){
            if(i == 3){
                i++;                // stepper is still required before skipping the iteration (i == 3)
                continue;
            }

            System.out.println(i);
            i++;                    // stepper to increment the loop
        }

    }
}
