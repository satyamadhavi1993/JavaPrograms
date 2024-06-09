package StringManipulations;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "abrakcadabra";
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        char[] charArr = str.toCharArray();
        for(char c:charArr) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c:charArr) {
            if (map1.get(c) == 1) {
                System.out.println("First unique character is "+c);
                break;
            }
        }
        
    }
}
