package variables;

public class NarrowTypeCasting {

    public static void main(String[] args) {

        // convert the value of double 100.04 to a long (64 bit)
        double d = 100.04;

        // explicitly typecast the value in d before storing it to variable l
        long l = (long) d;

        // explicitly typecast the value in l before storing it to variable i
        int i = (int) l;

        System.out.println("Double value of d: " + d);
        System.out.println("Long value of l: " + l);
        System.out.println("Int value of i: " + i);

    }
}
