package Numbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int i = 10, j = 20;

        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("i = "+i+", j = "+j);
    }
}