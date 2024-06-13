package StringManipulations;

public class ReverseStringPreservingSpecialCharacters {
    // Write a code to reverse a string without changing the position of the special characters.
    public static void main(String[] args) {
        String str = "Ab,c,de!$";     //ed,c,bA!$
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] charArr = str.toCharArray();

        while (left < right) {
            if (! Character.isLetterOrDigit(charArr[left])) {
                left++;
            } 
            else if (! Character.isLetterOrDigit(charArr[right])) {
                right--;
            }
            else {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }

        }
        return new String(charArr);
    }
}
