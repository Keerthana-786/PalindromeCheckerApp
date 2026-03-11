// ============================================================
//  PalindromeCheckerApp
//  UC5 - Stack-Based Palindrome Checker
//  Version : 5.0
// ============================================================
import java.util.Stack;

public class UseCase5PalindromeChecker {

    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return word.equals(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC5: Stack-Based Palindrome Checker     ");
        System.out.println("   Version : 5.0                           ");
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
