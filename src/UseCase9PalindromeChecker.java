// ============================================================
//  PalindromeCheckerApp
//  UC9 - Recursive Palindrome Checker
//  Version : 9.0
// ============================================================
public class UseCase9PalindromeChecker {

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC9: Recursive Palindrome Checker       ");
        System.out.println("   Version : 9.0                           ");
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
