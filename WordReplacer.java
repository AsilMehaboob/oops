public class WordReplacer {
    public static void main(String[] args) {
        String input = "A batman with bat";
        String wordToReplace = "bat";
        String replacementWord = "snow";
        
        // Replace all occurrences of 'wordToReplace' with 'replacementWord'
        String result = input.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}
