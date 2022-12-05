import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("Array List Demo");
        
        // Create an ArrayList object
        ArrayList<String> myList = new ArrayList<String>(); 
        // <String> is a generics since ArrayList can take different types

        // Add items to it
        myList.add("Pokemon");
        myList.add("CDs");
        myList.add("Vinyl");

        //Removing item from list
        myList.remove("Pokemon");

        // Loop over and print the items
        for(String item : myList) {
            System.out.println("Item: " + item);
        }


        //Print number of items inside the list
        int size = myList.size();
        System.out.println(size);




    }
}