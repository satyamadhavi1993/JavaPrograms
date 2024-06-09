package StringManipulations;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "abc";
		String str2 = "baa";

        if (str1.length() != str2.length()) {
            System.out.println("Are given strings anagrams ? false");
        } else {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("Are given strings anagrams ? "+String.valueOf(c1).equalsIgnoreCase(String.valueOf(c2)));
        }
    }
}
