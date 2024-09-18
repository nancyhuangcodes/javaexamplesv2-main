package mapscollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps1 {

    public static void main(String[] args) {

        // HashMaps interfaces with the Map object (based on key: value)
        Map<Integer, String> map = new HashMap<>();

        // Populate our map, using the method put()
        map.put(1, "Raymond");
        map.put(2, "Jason");
        map.put(3, "Sammie");
        map.put(4, "Theresa");

        System.out.println(map);

        // 1. To traverse through a HashMap
        // Start with creating a map entrySet and setting an Iterator object
        Set set = map.entrySet();
        Iterator iterations = set.iterator();

        // Using while loop to iterate through a HashMap
        // through each iteration we print out the key:value pair found in the HashMap
        while (iterations.hasNext()){
            Map.Entry entry = (Map.Entry)iterations.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 2. Use For-Each loop to iterate through a HashMap
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 3. Map interface (only contains definition) <--> HashMap (implementation)
        // In this implementation, we run a lambda expression as an execution code block
        map.forEach((key, value)-> System.out.println("user " + key + " : " + value));

        // In this implementation, we run the execution code block as lambda statements
        map.forEach((key, value)->{
            System.out.println("user " + key + ":");
            System.out.println(value);
            System.out.println("\n");
        });
    }
}
