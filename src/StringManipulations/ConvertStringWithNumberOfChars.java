package StringManipulations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertStringWithNumberOfChars {
    public static void main(String[] args) {
        String str = "aaabbccdaafffffi";
        System.out.println(updateString(str));
        System.out.println(updateStringUsingRegex(str));
    }

    public static String updateString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String str2 = "";
        int count = 1;
        char previousChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == previousChar) {
                count++;
                previousChar = str.charAt(i);
            }
            else {
                str2 += String.valueOf(previousChar) + count;
                previousChar = str.charAt(i);
                count = 1;
            }

            if (str.charAt(i) == previousChar && (i == str.length() - 1)) {
                str2 += String.valueOf(previousChar) + count;
            }
            if (str.charAt(i) != previousChar && (i == str.length() - 1)) {
                str2 += String.valueOf(str.charAt(i)) + count;
            }
        }
        return str2;
    }

    public static String updateStringUsingRegex(String str) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("((\\w)\\2*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            sb.append(group.charAt(0)).append(group.length());
        }
        return sb.toString();
    }
}
