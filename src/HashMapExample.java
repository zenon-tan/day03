import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        
        // Key / Value type
        // String / Integer

        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        // Add a Key-Value pair

        myMap.put("Mother", 34);
        myMap.put("Monster", 45);

        // Get value from key
        int age = myMap.get("Monster");
        System.out.printf("Value for key = %d\n", age);

        // Change value of key
        myMap.put("Mother", 999);
        int age2 = myMap.get("Mother");
        System.out.printf("Value for key = %d\n", age2);

        // CHeck if key exists
        boolean isExists = myMap.containsKey("Gaga");
        System.out.println("Does key exists? " + isExists);


        // Creating a HashMap of String Key and ArrayList value
        HashMap<String, ArrayList<String>> newMap = new HashMap<String, ArrayList<String>>(); 

        newMap.put("Mother", new ArrayList<String>());
        newMap.put("Monster", new ArrayList<String>());
        newMap.put("Haus", new ArrayList<String>());
        
    }
    
}
