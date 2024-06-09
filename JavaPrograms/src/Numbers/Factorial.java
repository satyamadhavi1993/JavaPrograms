package Numbers;

public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial is "+factorialNumber(num));
        System.out.println("Factorial is "+factorialNumber(num));
    }

    public static int factorialNumber(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        for (int i = num; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }

    public static int factorialNumberUsingRecursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorialNumberUsingRecursion(num - 1);
    }
}
