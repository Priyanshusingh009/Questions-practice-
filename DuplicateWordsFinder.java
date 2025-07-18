import java.util.Arrays;
import java.util.Scanner;
public class DuplicateWordsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Step 3: Convert the sentence to lowercase to avoid case issues (e.g., "Java" and "java")
        sentence = sentence.toLowerCase();

        // Step 4: Split the sentence into words using space
        String[] words = sentence.split(" ");

        System.out.println("Duplicate words in the sentence are:");
        for (int i = 0; i < words.length; i++) {
            // Skip empty words (in case of extra spaces)
            if (words[i].equals(""))
                continue;

            int count = 1; // count current word

            for (int j = i + 1; j < words.length; j++) {
                // If word matches with another word
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = ""; // mark as counted by setting it empty
                }
            }

            if (count > 1) {
                System.out.println(words[i]);
            }
        }

        scanner.close(); // Close scanner
    }
}
    

