// ============================================================
//  PalindromeCheckerApp
//  UC3 - Palindrome Check Using String Reverse
//  Version : 3.0
// ============================================================
public class UseCase3PalindromeChecker {

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC3: Palindrome Check - String Reverse  ");
        System.out.println("   Version : 3.0                           ");
        System.out.println("===========================================");
        System.out.println();

        String[] words = { "madam", "racecar", "hello", "level", "world" };

        for (String word : words) {
            System.out.printf("  %-10s : %s%n", word,
                isPalindrome(word) ? "Palindrome" : "Not a Palindrome");
        }

        System.out.println();
        System.out.println("  Application terminated successfully.");
    }
}
