// ============================================================
//  PalindromeCheckerApp
//  UC6 - Queue + Stack Based Palindrome Check
//  Version : 6.0
// ============================================================
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeChecker {

    public static boolean isPalindrome(String word) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            queue.offer(c);
            stack.push(c);
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC6: Queue + Stack Palindrome Check     ");
        System.out.println("   Version : 6.0                           ");
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
