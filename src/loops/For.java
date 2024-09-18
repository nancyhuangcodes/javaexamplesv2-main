package loops;

public class For {
    public static void main(String[] args) {

        // count up initializer = 10
        int countUp = 10;

        // create a for loop counting from 1 to 10
        // printing "Happy May Day" if the value is == 10
        for (int i = 1; i <= countUp; i++) {
            System.out.println(i);

            if(i == 10)
                System.out.println("Happy May Day!");
        }

        // Write a countdown loop using the countUp to initialise the loop
        // Counting from 10 to 1, and finally printing "Happy Labour Day"
        for (int i = countUp; i >= 1 ; i--) {
            System.out.println(i);
            if(i == 1)
                System.out.println("Happy Labour Day!");
        }
    }
}
