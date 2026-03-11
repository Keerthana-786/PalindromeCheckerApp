// ============================================================
//  PalindromeCheckerApp
//  UC4 - Character Array Based Palindrome Check
//  Version : 4.0
// ============================================================
public class UseCase4PalindromeChecker {

    public static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        int left  = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC4: Character Array Palindrome Check   ");
        System.out.println("   Version : 4.0                           ");
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
