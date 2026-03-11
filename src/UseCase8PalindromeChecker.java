// ============================================================
//  PalindromeCheckerApp
//  UC8 - Linked List Based Palindrome Checker
//  Version : 8.0
// ============================================================
import java.util.LinkedList;

public class UseCase8PalindromeChecker {

    public static boolean isPalindrome(String word) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : word.toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC8: Linked List Palindrome Checker     ");
        System.out.println("   Version : 8.0                           ");
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
