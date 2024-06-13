package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, -10, 31, 46, 59, 12, -6, 5, 7, 13, -17, 3, 2, -8, 15, -29, 71));
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int number:numbers) {
            (number >= 0 ? positive:negative).add(number);
        }
        System.out.println("Positive Numbers: "+positive);
        System.out.println("Negative Numbers: "+negative);
    }
}
