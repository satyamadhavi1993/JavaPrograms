package StringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimeNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 10, 31, 46, 59, 12, 6, 5, 7, 13, 17, 3, 2, 8, 15, 29, 71));
        List<Integer> prime = new ArrayList<>();
        List<Integer> composite = new ArrayList<>();
        for (int number:numbers) {
            (isPrime(number) ? prime : composite).add(number);
        }
        System.out.println("Prime Number list: "+prime);
        System.out.println("Composite Number list: "+composite);
    }

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number <= 1 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
