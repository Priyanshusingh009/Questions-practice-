public class CommonElementArray{

    // to find and print common elements using for loop
    public static void findCommon(int[] arr1, int[] arr2, int[] arr3) {
        System.out.print("Common elements are: ");

       
        for (int i = 0; i < arr1.length; i++) {
            int element = arr1[i];
            boolean foundInArr2 = false;
            boolean foundInArr3 = false;

            // Check if element is in second array
            for (int j = 0; j < arr2.length; j++) {
                if (element == arr2[j]) {
                    foundInArr2 = true;
                    break;
                }
            }

            // Check if element is in third array
            for (int k = 0; k < arr3.length; k++) {
                if (element == arr3[k]) {
                    foundInArr3 = true;
                    break;
                }
            }

            
            if (foundInArr2 && foundInArr3) {
                System.out.print(element + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommon(arr1, arr2, arr3);
    }
}