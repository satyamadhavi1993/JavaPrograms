package StringManipulations;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateCharactersAndWordsInAString {
    public static void main(String[] args) {
        String str = "sathyamadshavti";
        removeDuplicateCharacters(str);
        printDuplicateCharacters(str);
        str = "my name is name is name";
        removeDuplicateWords(str);
        printDuplicateWords(str);
    }

    public static void removeDuplicateCharacters(String str) {
        Set<Character> set1 = new HashSet<Character>();
        String str2 = "";
        for (char c:str.toCharArray()) {
            if(set1.add(c)) {
                str2 += Character.toString(c);
            }
        }
        System.out.println(str2);
    }

    public static void removeDuplicateWords(String str) {
        String[] strArr = str.split(" ");
        Set<String> set1 = new HashSet<String>(Arrays.asList(strArr));
        String str2 = "";
        for (String s:set1) {
            str2 += s;
        }
        System.out.println(str2);
    }

    public static void printDuplicateCharacters(String str) {
        Set<Character> set1 = new HashSet<Character>();
        for (char c:str.toCharArray()) {
            if(! set1.add(c)) {
                System.out.println("Duplicate character "+c);
            }
        }
    }

    public static void printDuplicateWords(String str) {
        String[] strArr = str.split(" ");
        Set<String> set1 = new HashSet<String>();
        for (String str2:strArr) {
            if(! set1.add(str2)) {
                System.out.println("Duplicate word "+str2);
            }
        }
    }

}
