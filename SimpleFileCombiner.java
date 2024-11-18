import java.io.*;

public class SimpleFileCombiner {
    public static void main(String[] args) {
        String file1Path = "f1.txt";
        String file2Path = "f2.txt";
        String outputFilePath = "merged.txt";

        try {
            // Open files for reading and writing
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line1, line2;

            // Read lines from both files and combine them
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                writer.write(line1 + "," + line2+"\n"); // Combine lines
                
            }

            // Close all resources
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files combined and written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
