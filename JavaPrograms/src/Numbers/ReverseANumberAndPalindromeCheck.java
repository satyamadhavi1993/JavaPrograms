package Numbers;

public class ReverseANumberAndPalindromeCheck {
    public static void main(String[] args) {
        int i = 123321;
        int j = 123121;
        int rev = reverse(i);
        System.out.println("Reverse of Number :: "+i+" is :: "+rev);
        System.out.println("Given number is palindrome :: "+ (i == rev));
        System.out.println("-----------------------------------------");
        rev = reverse(j);
        System.out.println("Reverse of Number :: "+j+" is :: "+rev);
        System.out.println("Given number is palindrome :: "+ (j == rev));
    }

    public static int reverse(int i) {
        // i = 123
        int rev = 0;
        while (i > 0) {
            rev = (rev * 10) + (i % 10);
            i = i / 10;
        }
        return rev;
    }
}
