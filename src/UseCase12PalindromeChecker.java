// ============================================================
//  PalindromeCheckerApp
//  UC12 - Strategy Pattern for Palindrome Algorithms
//  Version : 12.0
// ============================================================
interface PalindromeStrategy {
    boolean check(String word);
    String strategyName();
}

class StringReverseStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
    @Override
    public String strategyName() { return "String Reverse Strategy"; }
}

class CharArrayStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String word) {
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left++] != chars[right--]) return false;
        }
        return true;
    }
    @Override
    public String strategyName() { return "Character Array Strategy"; }
}

class RecursiveStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return check(word.substring(1, word.length() - 1));
    }
    @Override
    public String strategyName() { return "Recursive Strategy"; }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(String word) {
        System.out.printf("  [%s] %-10s : %s%n",
            strategy.strategyName(), word,
            strategy.check(word) ? "Palindrome" : "Not a Palindrome");
    }
}

public class UseCase12PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   PalindromeCheckerApp                    ");
        System.out.println("   UC12: Strategy Pattern                  ");
        System.out.println("   Version : 12.0                          ");
        System.out.println("===========================================");
        System.out.println();

        String[] words = { "madam", "racecar", "hello", "level" };

        PalindromeContext context = new PalindromeContext(new StringReverseStrategy());
        for (String w : words) context.execute(w);
        System.out.println();

        context.setStrategy(new CharArrayStrategy());
        for (String w : words) context.execute(w);
        System.out.println();

        context.setStrategy(new RecursiveStrategy());
        for (String w : words) context.execute(w);
        System.out.println();

        System.out.println("  Application terminated successfully.");
    }
}
