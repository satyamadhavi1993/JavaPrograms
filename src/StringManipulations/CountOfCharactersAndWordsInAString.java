package StringManipulations;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountOfCharactersAndWordsInAString {
    public static void main(String[] args) {
        String str = "sathyamadshavti";
        countCharacters(str);
        str = "my name is name is name";
        countWords(str);
        usingCollectionsFrequencyMethod(str);
    }

    public static void countCharacters(String str) {
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (char c:charArr) {
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        // map1.forEach((k, v) -> System.out.println(k +" - "+ v));
        System.out.println(map1);
    }

    public static void countWords(String str) {
        String[] strArr = str.split(" ");
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (String s:strArr) {
            map1.put(s, map1.getOrDefault(s, 0)+1);
        }

        // map1.forEach((k, v) -> System.out.println(k +" - "+ v));
        System.out.println(map1);
    }

    public static void usingCollectionsFrequencyMethod(String str) {
		List<String> list1 = new ArrayList<String>(Arrays.asList(str.split(" ")));
		Set<String> set1 = new HashSet<String>(list1);
		set1.forEach(s -> System.out.println("Frequency of " + s + " is " + Collections.frequency(list1, s)));
	}

}
