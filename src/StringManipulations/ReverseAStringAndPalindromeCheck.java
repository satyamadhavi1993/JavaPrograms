package StringManipulations;

public class ReverseAStringAndPalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String rev = reverse(str);
        System.out.println("String reverse is :: "+rev);
        System.out.println("Given string is palindrome :: "+str.equals(rev));
        String str2 = "My Name is Satya Madhavi";
        System.out.println("String reverse is :: "+reverseWords(str2));
        rev = reverseUsingRecursion("satyam");
        System.out.println("String reverse is :: "+rev);

    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String reverseWords(String str) {
        String rev = "";
        String[] strArray = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            rev += strArray[i] + " ";
        }
        return rev;
    }

    public static String reverseUsingRecursion(String str) {
        if (str.length() == 0) 
            return str;
        return str.charAt(str.length() - 1) + reverseUsingRecursion(str.substring(0, str.length() - 1));
    }
}
