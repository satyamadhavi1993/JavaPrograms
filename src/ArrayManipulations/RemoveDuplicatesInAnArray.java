package ArrayManipulations;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInAnArray {
    public static void main(String[] args) {
        String languages[] = { "Java", "Ruby", "Javascript", "Java", "Python", "C", "Ruby" };
        System.out.println("After removing duplicates, if any :: "+removeDuplicates1(languages));
        System.out.println("Contains duplicates :: "+checkIfAnArrayContainsDuplicates(languages));
    }

    public static Set<String> removeDuplicates1(String languages[]) {
        Set<String> set1 = new HashSet<>(Arrays.asList(languages));
        return set1;
    }
    
    public static boolean checkIfAnArrayContainsDuplicates(String languages[]) {
        Set<String> set1 = new HashSet<>(Arrays.asList(languages));
        return (set1.size() != languages.length);
    }
}
