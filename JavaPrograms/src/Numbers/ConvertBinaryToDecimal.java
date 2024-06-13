package Numbers;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1011";
        System.out.println(binaryToDecimal(binary));
    }

    public static int binaryToDecimal(String str) {
        int decimalNumber = 0;
        int length = str.length();
        char c = '\0';
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '1') {
                decimalNumber += Math.pow(2, length - 1 - i);
            }
        }
        return decimalNumber;
    }
}
