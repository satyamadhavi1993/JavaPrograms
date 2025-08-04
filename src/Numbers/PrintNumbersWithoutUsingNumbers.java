package Numbers;

public class PrintNumbersWithoutUsingNumbers {
    // Print 1 to 100 without using numbers
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "abcdefghij";
        int str1_length = str1.length();
        int str2_length = str2.length();

        for (int i = str1_length; i <= str2_length * str2_length; i++) {
            System.out.println(i);
        }
    }
}
