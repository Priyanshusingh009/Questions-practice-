import java.util.ArrayList;
import java.util.Arrays;
public class arrayList_2 {
    public static void main(String[] args) {
        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        // Create an ArrayList of strings and initialize it with the contents of the array.
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_array));

        // Print the ArrayList to the console.
        System.out.println(list);
    }
    
}
