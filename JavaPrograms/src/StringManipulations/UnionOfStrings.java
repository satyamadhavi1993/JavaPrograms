package StringManipulations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(findUnion(str1, str2));
        System.out.println(findUnionInOrder(str1, str2));
        System.out.println(findUnionWithAscOrDesc(str1, str2, true));
        System.out.println(findUnionWithAscOrDesc(str1, str2, false));
    }

    public static String findUnion(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            set1.add(str2.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c:set1) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String findUnionInOrder(String str1, String str2) {
        Set<Character> set1 = new LinkedHashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            set1.add(str2.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c:set1) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String findUnionWithAscOrDesc(String str1, String str2, boolean ascending) {
        Set<Character> unionSet;
        if (ascending) {
            unionSet  = new TreeSet<>((a, b) -> (Character.toLowerCase(a) - Character.toLowerCase(b)));
        } 
        else {
            unionSet  = new TreeSet<>((a, b) -> (Character.toLowerCase(b) - Character.toLowerCase(a)));
        }
        // Add characters from str1 to the set
        for (char c : str1.toCharArray()) {
            unionSet.add(c);
        }

        // Add characters from str2 to the set
        for (char c : str2.toCharArray()) {
            unionSet.add(c);
        }

        // Convert set to string
        StringBuilder unionBuilder = new StringBuilder();
        for (char c : unionSet) {
            unionBuilder.append(c);
        }

        return unionBuilder.toString();
    }
}
