package StringManipulations;

public class FindCommonPrefixInStringArray {
    public static void main(String[] args) {
        String[] str_array = {"flower", "flow", "flight"};
        System.out.println(commonPrefix(str_array)); // Output: "fl"
    }

    // public static String bruteForce(String[] str_array) {
    //     if (str_array.length == 0 || str_array == null) {
    //         return "";
    //     }
        
    //     for (int i = 0; i < str_array.length; i++) {
            
    //     }
    // }


    public static String longestPrefix(String[] str_array) {

        return "";
    }

    public static String commonPrefix(String[] strs1) {
        if (strs1.length <= 1) {
            return strs1[0];
        }
        int p1 = 0, p2 = 0;
        String first = strs1[0];
        String second = strs1[1];
        StringBuilder sb = new StringBuilder();
        while (p1 < first.length() && p2 < second.length()) {
            if (first.charAt(p1) != second.charAt(p2)) {
                break;
            }
            else {
                sb.append(first.charAt(p1));
                p1++;
                p2++;
            }
        }
        return sb.toString();
    }
}
