// ============================================================
//  PalindromeCheckerApp
//  UC11 - Object-Oriented Palindrome Service
//  Version : 11.0
// ============================================================
interface PalindromeChecker {
    boolean check(String word);
}

class BasicPalindromeChecker implements PalindromeChecker {
    @Override
    public boolean check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}

class CaseInsensitivePalindromeChecker implements PalindromeChecker {
    @Override
    public boolean check(String word) {
        String cleaned = word.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}

class PalindromeService {
    private PalindromeChecker checker;

    public PalindromeService(PalindromeChecker checker) {
        this.checker = checker;
    }

    public void checkAndDisplay(String word) {
        System.out.printf("  %-40s : %s%n", word,
            checker.check(word) ? "Palindrome" : "Not a Palindrome");
    }
}

public class UseCase11PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC11: OO Palindrome Service             ");
        System.out.println("   Version : 11.0                          ");
        System.out.println("===========================================");
        System.out.println();

        System.out.println("  Basic Checker:");
        System.out.println("  -------------------------------------------");
        PalindromeService basicService = new PalindromeService(new BasicPalindromeChecker());
        basicService.checkAndDisplay("madam");
        basicService.checkAndDisplay("racecar");
        basicService.checkAndDisplay("hello");
        System.out.println();

        System.out.println("  Case-Insensitive Checker:");
        System.out.println("  -------------------------------------------");
        PalindromeService ciService = new PalindromeService(new CaseInsensitivePalindromeChecker());
        ciService.checkAndDisplay("Madam");
        ciService.checkAndDisplay("A man a plan a canal Panama");
        ciService.checkAndDisplay("Hello");
        System.out.println();

        System.out.println("  Application terminated successfully.");
    }
}
