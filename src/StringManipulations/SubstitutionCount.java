package StringManipulations;

import java.util.ArrayList;
import java.util.List;

public class SubstitutionCount {

    public static int countSubstitutions(String word) {
        int count = 0;
        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                chars[i] = '@';
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("adde");
        words.add("boook");
        words.add("break");

        List<Integer> substitutions = new ArrayList<>();
        for (String word : words) {
            substitutions.add(countSubstitutions(word));
        }

        System.out.println("Minimum substitutions needed for each word: " + substitutions);
    }
}

