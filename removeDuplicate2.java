import java.util.*;
public class removeDuplicate2{
    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5}; // sorted array

        int[] new_arr = new int[array.length];
        new_arr[0] = array[0];
        int index = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                new_arr[index] = array[i];
                index++;
            }
        }

        // Create final array of correct size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = new_arr[i];
        }

        System.out.println("The length of modified array is: " + result.length);
        System.out.println("Modified array: " + Arrays.toString(result));
    }
       
}
    

