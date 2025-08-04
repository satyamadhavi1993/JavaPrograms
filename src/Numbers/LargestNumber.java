package Numbers;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 90, b = 80, c = 100;
        int temp = a > b ? a : b;
        int largest_number = temp > c ? temp : c;
        System.out.println("Largest Number is "+largest_number);
    }
}
