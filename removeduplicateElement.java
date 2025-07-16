import java.util.Arrays;
public class removeduplicateElement{
    public static void main(String[] args) {
        int[] arr = {4, 34, 89, 34, 4, 56, 89, 67};
        System.out.println("origial array is :\n"+Arrays.toString(arr));

        Arrays.sort(arr); // Sort the array

        int[] temp = new int[arr.length];
        int x = 0;
        temp[x] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != temp[x]) {
                x++;
                temp[x] = arr[i];
            }
        }
        //System.out.println(Arrays.toString(temp));

        // Now create actual array with exact size
        int[] uniqueArray = new int[x + 1];
        for (int i = 0; i <= x; i++) {
            uniqueArray[i] = temp[i];
        }

        // Now print the actual array
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}