package variables;

public class WideningTypeCasting {

    public static void main(String[] args) {

        //Widening Typecasting Example

        int i = 100;

        // automatic type conversion from int (32 bit) to long (64 bit) whole numbers
        long l = i;

        // automatic type conversion from long to a floating point value
        float f = l;

        System.out.println("int value of i: " + i);
        System.out.println("long value of l: " + l);
        System.out.println("float pt value of f: " + f);
    }
}
