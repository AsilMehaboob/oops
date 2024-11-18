import java.io.*;
import java.util.*;

public class SortWordsToFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SortWordsToFile <outputFileName>");
            return;
        }

        String outputFileName = args[0];
        System.out.println("Enter a line of words:");
        
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        // Use StringTokenizer to split words
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        List<String> words = new ArrayList<>();

        // Collect words
        while (tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }

        // Sort the words
        Collections.sort(words);

        // Write sorted words to the specified file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            for (String word : words) {
                writer.println(word);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        // Print the number of words in the terminal
        System.out.println("Number of words in " + outputFileName + " file = " + words.size());
    }
}
