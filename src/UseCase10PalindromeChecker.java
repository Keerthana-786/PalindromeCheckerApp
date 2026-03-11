// ============================================================
//  PalindromeCheckerApp
//  UC10 - Case-Insensitive & Space-Ignored Palindrome
//  Version : 10.0
// ============================================================
public class UseCase10PalindromeChecker {

    public static boolean isPalindrome(String word) {
        String cleaned = word.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC10: Case-Insensitive Palindrome       ");
        System.out.println("   Version : 10.0                          ");
        System.out.println("===========================================");
        System.out.println();

        String[] words = { "Madam", "RaceCar", "Hello", "A man a plan a canal Panama", "Was it a car or a cat I saw" };

        for (String word : words) {
            System.out.printf("  %-40s : %s%n", word,
                isPalindrome(word) ? "Palindrome" : "Not a Palindrome");
        }

        System.out.println();
        System.out.println("  Application terminated successfully.");
    }
}
