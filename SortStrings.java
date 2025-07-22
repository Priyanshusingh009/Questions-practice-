public class SortStrings {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "mango", "grapes"};

        // Sorting using compareTo
        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                // Compare two strings
                if (fruits[i].compareTo(fruits[j]) > 0) {
                  
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        
        System.out.println("Sorted fruits (alphabetical order):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}