// ============================================================
//  PalindromeCheckerApp
//  UC7 - Deque-Based Optimized Palindrome Checker
//  Version : 7.0
// ============================================================
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC7: Deque-Based Palindrome Checker     ");
        System.out.println("   Version : 7.0                           ");
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
