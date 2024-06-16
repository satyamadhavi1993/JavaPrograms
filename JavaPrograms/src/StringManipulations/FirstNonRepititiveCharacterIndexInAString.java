package StringManipulations;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepititiveCharacterIndexInAString {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println("Index is: "+getFirstUniqueCharacter(str));
    }

    public static int getFirstUniqueCharacter(String str) {
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map1.put(str.charAt(i), map1.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map1.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
