package Numbers;

public class ArmstrongNumber {
    // Sum of cubes of digits in a number is equal to the number. 
    // If the number contains 5 digits, sum of power 5 of digits should be calculated
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int i = 0;
        while(temp > 0) {
            // n = temp % 10;
            // i += n * n * n;
            i += Math.pow(temp % 10, 3);
            temp = temp/10;
        }
        System.out.println("Is armstrong number ? "+ (number == i));
    }
}
