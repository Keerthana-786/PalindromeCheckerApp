// ============================================================
//  PalindromeCheckerApp
//  UC13 - Performance Comparison
//  Version : 13.0
// ============================================================
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase13PalindromeChecker {

    // Strategy 1: String Reverse
    public static boolean stringReverse(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    // Strategy 2: Character Array
    public static boolean charArray(String word) {
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left++] != chars[right--]) return false;
        }
        return true;
    }

    // Strategy 3: Stack
    public static boolean stackBased(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return word.equals(reversed.toString());
    }

    // Strategy 4: Deque
    public static boolean dequeBased(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }
        return true;
    }

    // Strategy 5: Recursive
    public static boolean recursive(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return recursive(word.substring(1, word.length() - 1));
    }

    public static void compare(String word) {
        System.out.println("  Word: " + word);
        System.out.println("  -------------------------------------------");

        long start, end;

        start = System.nanoTime();
        boolean r1 = stringReverse(word);
        end = System.nanoTime();
        System.out.printf("  String Reverse  : %-18s | Time: %d ns%n", r1 ? "Palindrome" : "Not a Palindrome", (end - start));

        start = System.nanoTime();
        boolean r2 = charArray(word);
        end = System.nanoTime();
        System.out.printf("  Char Array      : %-18s | Time: %d ns%n", r2 ? "Palindrome" : "Not a Palindrome", (end - start));

        start = System.nanoTime();
        boolean r3 = stackBased(word);
        end = System.nanoTime();
        System.out.printf("  Stack           : %-18s | Time: %d ns%n", r3 ? "Palindrome" : "Not a Palindrome", (end - start));

        start = System.nanoTime();
        boolean r4 = dequeBased(word);
        end = System.nanoTime();
        System.out.printf("  Deque           : %-18s | Time: %d ns%n", r4 ? "Palindrome" : "Not a Palindrome", (end - start));

        start = System.nanoTime();
        boolean r5 = recursive(word);
        end = System.nanoTime();
        System.out.printf("  Recursive       : %-18s | Time: %d ns%n", r5 ? "Palindrome" : "Not a Palindrome", (end - start));

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC13: Performance Comparison            ");
        System.out.println("   Version : 13.0                          ");
        System.out.println("===========================================");
        System.out.println();

        compare("madam");
        compare("racecar");
        compare("hello");

        System.out.println("  Application terminated successfully.");
    }
}
