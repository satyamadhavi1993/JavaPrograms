package Numbers;

public class NeonNumber {
    // sum of the digits of its square equals the number itself
    public static void main(String[] args) {
        int num = 9;
        int num2 = num * num;
        int sum = 0;
        while(num2 > 0){
            sum += num2 % 10;
            num2 = num2 / 10;
        }
        System.out.println("Is a Neon number ? "+(sum == num));
    }
}
