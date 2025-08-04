package StringManipulations;

import java.util.Arrays;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(reverse(s)));
    }

    public static char[] reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
