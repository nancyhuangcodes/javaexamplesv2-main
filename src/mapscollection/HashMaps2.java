package mapscollection;

import java.util.HashMap;
import java.util.Map;

public class HashMaps2 {
    public static void main(String[] args) {

        // HashMap of names and addresses
        // Declare and init our HashMap with key:values
        Map<String, String> customerAddressMap = new HashMap<>(){
            {
                put("Jason Ong", "Address 1");
                put("Alex Lim", "Address 2");
                put("Samantha Lee", "Address 3");
                put("Carlos Yip", "Address 4");
            }
        };

        int customerSize = customerAddressMap.size();
        System.out.println("customer address map size is: " + customerSize);

        // Verify whether a customer key exists
        boolean customerKeyExists = customerAddressMap.containsKey("Jason Ong");
        System.out.println(customerKeyExists);

        // Verify whether a customer value exists
        boolean customerValueExists = customerAddressMap.containsValue("Address 4");
        System.out.println(customerValueExists);

        // Get the data based on the key: "Carlos Yip"
        System.out.println(customerAddressMap.get("Carlos Yip"));

        // Remove key "Carlos Yip" from customerAddressMap
        customerAddressMap.remove("Carlos Yip");
        System.out.println(customerAddressMap);

        // Sieve out whether "Address 1" exists as a value within HashMap customerAddressMap
        boolean customerAddressLowerCase = customerAddressMap.toString().toLowerCase().contains("address 1");
        System.out.println(customerAddressLowerCase);
    }
}
