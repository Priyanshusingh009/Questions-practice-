import java.util.Arrays;
import java.util.Scanner;
public class Insertelement {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49, };
        
    // Define the position where the new element will be inserted.
    System.out.println("enter the index at which  you want to insert");
    int position=input.nextInt();
        
    // Define the value of the new element to be inserted.
    System.out.println("Insert the value you want to insert ");
    int value=input.nextInt();   
    System.out.println("Original Array : " + Arrays.toString(my_array));     
    int[] new_array = new int[my_array.length + 1];

        // Insert elements before the position
        for (int i = 0; i < position; i++) {
            new_array[i] = my_array[i];
        }

        // Insert the new value
        new_array[position] = value;

        // Insert remaining elements after the position
        for (int i = position; i < my_array.length; i++) {
            new_array[i + 1] = my_array[i];
        }
        System.out.println("inserted array is "+Arrays.toString(new_array));

       
        
        
     
    }
   

}

