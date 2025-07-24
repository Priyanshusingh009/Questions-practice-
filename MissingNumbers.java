public class MissingNumbers {

    
    public static void findMissingNumbers(int[] original, int[] modified) {
        System.out.print("Missing numbers are: ");

        for (int i = 0; i < original.length; i++) {
            boolean found = false;

            // Check if current number from original is in modified
            for (int j = 0; j < modified.length; j++) {
                if (original[i] == modified[j]) {
                    found = true;
                    break;
                }
            }

            // If not found, it's missing
            if (!found) {
                System.out.print(original[i] + " ");
            }
        }
    }

    
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] modified = {2, 3, 5};

        
        findMissingNumbers(original, modified);
    }
}