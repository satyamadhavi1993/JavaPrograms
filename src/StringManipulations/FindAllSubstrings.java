package StringManipulations;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubstrings {
    public static void main(String[] args) {
        String str = "abbcc";
        List<String> substrings = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length();j++) {
                substrings.add(str.substring(i, j));
            }
        }
        for (String substrings2 : substrings) {
            System.out.println(substrings2);
        }
        System.out.println("Number of Substrings in "+str+" is : "+substrings.size());
    }
}
