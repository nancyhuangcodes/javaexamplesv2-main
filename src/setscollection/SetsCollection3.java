package setscollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SetsCollection3{

    public static void main(String[] args) {

        // Declare out Set variables of type Integer
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Declare 2 arrays to populate setA and setB
        Integer[] arrListA = new Integer[]{1, 2, 3};
        Integer[] arrListB = new Integer[]{3, 4, 5};

        // Init values onto setA and setB using addAll() for Sets
        setA.addAll(Arrays.asList(arrListA));
        setB.addAll(Arrays.asList(arrListB));

        // printout the data from both sets
        System.out.println(setA);
        System.out.println(setB);

        // Unionise the data between setA and setB
        Set<Integer> union = new HashSet<>(setA);       // need to init with setA's data
        union.addAll(setB);                             // unionise the data found in setB
        System.out.println(union);                      // output: [1, 2, 3, 4, 5]

        // Intersected data between setA and setB
        Set<Integer> intersect = new HashSet<>(setA);   // need to init with setA's data
        intersect.retainAll(setB);                      // intersect the data based on setB
        System.out.println(intersect);                  // output: [3]

        // Difference of data between setA and setB
        Set<Integer> difference = new HashSet<>(setA);  // need to init with setA's data
        difference.removeAll(setB);                     // output the difference between setA's data and setB
        System.out.println(difference);                 // output: [1, 2]
    }

}