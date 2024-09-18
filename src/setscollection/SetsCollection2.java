package setscollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsCollection2 {

    public static void main(String[] args) {

        // names
        Set<String> names = new HashSet<String>();

        names.add("Santiago");
        names.add("Andres");
        names.add("Andres Gonzales");
        names.add("Emily");
        names.add("Santiago");

        // Add an array of names to a set (via for loop)
        // Q: How do I add newNames to names (via for loop)
        String[] newNames = {"Jameson", "Benny", "Maggie"};
        for (int i = 0; i < newNames.length ; i++) {
            names.add(newNames[i]);
        }

        // print the names, including the new additions
        System.out.println(names);

        // print out the name one at a time
        for (String name: names) {
            System.out.println(name);
        }

        // If the name "Andres" is found in names, change the value to "Andres (confirmed)"
        // Challenge:
        if(names.contains("Andres")){
            names.remove("Andres");
            names.add("Andres (confirmed)");
        }

        System.out.println(names);

        // Xun's approach
        for (String name: names) {
            if (name.equals("Emily")) {
                names.remove("Emily");
                names.add("Emily (confirmed)");
                break;
            }
        }

        System.out.println(names);

        // Colin's approach
        for (String name : names){
            if(name.equals("Benny")){
                String newName = name.replace(name, "Benny (Confirmed)");
                names.remove(name);
                names.add(newName);
                break;
            }
        }

        System.out.println(names);

        // Another approach to loop through data
        Set<String> namesCopy = new HashSet<String>(names);

        // Use Set namesCopy's built-in method forEach to update names where name is "Jameson"
        namesCopy.forEach(name->{
            if(name.equals("Jameson")) {
                names.remove(name);
                names.add(name + " (Confirmed)");
            }
        });

        System.out.println(names);

        // Use a copy similar to th above to update all elements within HashSet "products"
        Set<String> products = new HashSet<String>();
        products.add("Product A");
        products.add("Product B");
        products.add("Product C");

        System.out.println(products);

        Set<String> productsCopy = new HashSet<String>(products);
        productsCopy.forEach(product->{
            products.remove(product);
            products.add(product + "- out of stock");
        });

        System.out.println(products);
    }
}
