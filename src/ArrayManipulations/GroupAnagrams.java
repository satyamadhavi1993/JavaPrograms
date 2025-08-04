package ArrayManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] anagrams = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(anagrams));
    }

    public static List<List<String>> groupAnagrams(String[] anagrams) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String anagram : anagrams) {
            char[] ch = anagram.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }
            anagramGroups.get(key).add(anagram);
        }
        return new ArrayList<>(anagramGroups.values());
    }
}
