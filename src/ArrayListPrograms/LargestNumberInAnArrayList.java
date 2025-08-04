package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumberInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(344, 523, 542, 11, 3, 8, 67, 35, 87, 14, 76, 12, 35, 11, 74, 423, 239));
        findLargestSecondLargestAndSmallestNumber(numbers);
        findLargestSecondLargestAndSmallestNumber2(numbers);
    }

    public static void findLargestSecondLargestAndSmallestNumber(ArrayList<Integer> numbers) {
        int largest = numbers.get(0), secondLargest = numbers.get(0), smallest = numbers.get(0);

        for (Integer number:numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if(number > secondLargest && number != largest) {
                secondLargest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest number is "+smallest);
        System.out.println("Second Largest number is "+secondLargest);
        System.out.println("Largest number is "+largest);

    }

    public static void findLargestSecondLargestAndSmallestNumber2(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        if (numbers.size() > 2) {
            System.out.println("Smallest number is "+numbers.get(0));
            System.out.println("Second Largest number is "+numbers.get(numbers.size() - 2));
            System.out.println("Largest number is "+numbers.get(numbers.size() - 1));
        } else {
            System.out.println("Smallest number is "+numbers.get(0));
            System.out.println("Largest number is "+numbers.get(numbers.size() - 1));
        }
    }
}
