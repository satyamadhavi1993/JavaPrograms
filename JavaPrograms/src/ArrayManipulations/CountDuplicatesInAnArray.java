package ArrayManipulations;

import java.util.Map;
import java.util.HashMap;

public class CountDuplicatesInAnArray {
    public static void main(String[] args) {
        String languages[] = { "Java", "Python", "Ruby", "Javascript", "Java", "Python", "C", "Ruby", "Python", "Java", "Python" };
        // usingHashMap(languages);
        printDuplicateElements(languages);
    }

    public static void usingHashMap(String languages[]) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (String language:languages) {
            map1.put(language, map1.getOrDefault(language, 0) + 1);
        }

        int max = 0;
        String max_language = "";
        for (String s:map1.keySet()) {
            if (map1.get(s) > max) {
                max = map1.get(s);
                max_language = s;
            }
        }

        map1.forEach((k, v) -> System.out.println(k +" - "+ v));
        System.out.println("Max Language is "+max_language+" with "+max+" times");
    }

    public static void printDuplicateElements(String languages[]) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (String language:languages) {
            Integer previous = map1.put(language, 1);
            if (previous != null) {
                System.out.println(language+" is duplicated");
            }
        }
    }
    
}
