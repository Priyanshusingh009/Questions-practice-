import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {


        //  ArrayList of Strings
        ArrayList<String> fruits=new ArrayList<>();

        // Adding elements 
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        
        System.out.println("Fruits: " + fruits);

        // Access an element using fruits.get(index:0)
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");

        // Print the list 
        System.out.println("After removing Banana: " + fruits);
    }
}
    
