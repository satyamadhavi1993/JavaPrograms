package Numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        // fibonacciSeries(num);
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        fibonacciSeriesUsingRecursion(num-2, a, b);
    }

    public static void fibonacciSeries(int num) {
        int a = 0, b = 1, c;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static int fibonacciSeriesUsingRecursion(int num, int a, int b) {
        if (num == 0) {
            return -1;
        }
        int c = a+b;
        System.out.print(c + " ");
        return fibonacciSeriesUsingRecursion(num-1, b, c);
    }
}
