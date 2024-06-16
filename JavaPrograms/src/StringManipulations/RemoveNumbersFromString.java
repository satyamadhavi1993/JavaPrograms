package StringManipulations;

public class RemoveNumbersFromString {
    public static void main(String[] args) {
        String str = "a1d3d4#a^%";
        System.out.println(removeNumbersUsingRegex(str));
        System.out.println(removeNumbers(str));
    }

    public static String removeNumbersUsingRegex(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String removeNumbers(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<str.length(); i++) {
            if (! Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
