import java.util.Scanner;
public class removeduplicateword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentance :");
        String input = scanner.nextLine();

        //  Split the input into words
        String[] words = input.split(" ");

        // Create a new array to store unique words
        String[] uniqueWords = new String[words.length];
        int uniqueCount = 0;

        //  Check each word for duplicates
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            // Check if words[i] already exists in uniqueWords
            for (int j = 0; j < uniqueCount; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    isDuplicate = true;
                    break; // No need to check more
                }
            }

            // If not duplicate, add to uniqueWords array
            if (!isDuplicate) {
                uniqueWords[uniqueCount] = words[i];
                uniqueCount++;
            }
        }

        System.out.println("After removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueWords[i] + " ");
        }

        scanner.close(); 
    }
}
    

