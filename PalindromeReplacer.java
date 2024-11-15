public class PalindromeReplacer {
    
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String replacePalindromes(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word) && word.length() > 1) {
                result.append("*".repeat(word.length()));
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "bob has a radar plane";
        String output = replacePalindromes(input);
        System.out.println(output); // Output: "*** has a ***** plane"
    }
}
