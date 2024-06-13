package StringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>(
            Arrays.asList("", "a", "abcdef", "aaaaaa", "aabbcde", "abcdeeff", "abccba", "abacabad", "aabbccddeeffgghh", "aabccbaab", "abbbccabcbbeefeehjjid"));
        List<String> arrListOutputs = new ArrayList<String>(
            Arrays.asList("", "a", "abcdef", "", "cde", "abcd", "abba", "abacabad", "", "bbb", "aabcfhid"));
        
        for (int i = 0; i < arrList.size(); i++) {
            String actual_output = removeConsecutiveDuplicates(arrList.get(i));
            if (! actual_output.equals(arrListOutputs.get(i))) {
                System.out.println("Input "+arrList.get(i)+ " and Expected Output is "+arrListOutputs.get(i)+
                " and Actual Output is "+actual_output);
            } else {
                System.out.println("Input: "+arrList.get(i)+ " and Output: "+actual_output);
            }
        }
    }

    public static String removeConsecutiveDuplicates(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char previousChar = '\0';
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i + 1) && str.charAt(i) != previousChar) {
                sb.append(str.charAt(i));
            }
            previousChar = str.charAt(i);
        }
        if (str.charAt(str.length()-1) != previousChar) {
            sb.append(str.charAt(str.length()-1));
        }
        return sb.toString();
    }
}
