public class shiftZero {
    public static void shiftZero(int[] arr) {
        int index = 0; // Index to place non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5}; // Sample array

        // Call the method to move zeros
        shiftZero(arr);

        // Print the updated array
        System.out.print("Array after moving 0s to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}