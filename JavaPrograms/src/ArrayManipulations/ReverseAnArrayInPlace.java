package ArrayManipulations;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C", "Golang", "Javascript", "C#"};
        System.out.println(Arrays.toString(reverse(languages)));
    }

    public static String[] reverse(String[] languages) {
        int left = 0;
        int right = languages.length - 1;
        String temp = "";
        while (left < right) {
            temp = languages[left];
            languages[left] = languages[right];
            languages[right] = temp;
            left++;
            right--;
        }
        return languages;
    }
}
