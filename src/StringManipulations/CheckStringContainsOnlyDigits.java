package StringManipulations;

public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        String str1 = "47398321";
        String str2 = "79283h8942";

        // System.out.println("Contains only digits ? "+usingIsDigitMethod(str1));
        // System.out.println("Contains only digits ? "+usingIsDigitMethod(str2));

        System.out.println("Contains only digits ? "+usingRegex(str1));
        System.out.println("Contains only digits ? "+usingRegex(str2));
    }

    public static boolean usingIsDigitMethod(String str) {
        for (char c:str.toCharArray()) {
            if (! Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean usingRegex(String str) {
        String str2 = str.replaceAll("[^0-9]", "");
        return str.equals(str2);
    }
}
