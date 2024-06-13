package StringManipulations;

public class Find1sInAString {
    // In a given string containing 1s and 0s, find the number of 1s.
    public static void main(String[] args) {
        String str = "100011101010101";
        System.out.println(find1s(str));
    }

    public static int find1s(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}