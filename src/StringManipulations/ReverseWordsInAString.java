package StringManipulations;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "Hi, this program reverses a String!";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = 0;
        while (end < charArr.length) {
            while (charArr[end] != ' ' && Character.isLetterOrDigit(charArr[end])) {
                end++;
            }
            reverseWord(charArr, start, end - 1);
            end++;
            start = end;
        }
        return new String(charArr);
    }

    public static void reverseWord(char[] charArr, int left, int right) {
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
    }
}
