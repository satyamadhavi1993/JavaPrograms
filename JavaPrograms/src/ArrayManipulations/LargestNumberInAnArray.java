package ArrayManipulations;

import java.util.Arrays;

public class LargestNumberInAnArray {
    public static void main(String[] args) {
        // int[] numbers = { 3, 5, -2, 6, 223, 3, 7, -30, -44, 15, 8, 113, 5, 4, 9, 5, 7 };
        int[] numbers = {344, 523, 542, 11, 3, 8, 67, 35, 87, 14, 76, 12, 35, 11, 74, 423, 239};
        findLargestSecondLargestAndSmallestNumber(numbers);
        findLargestSecondLargestAndSmallestNumber2(numbers);
    }

    public static void findLargestSecondLargestAndSmallestNumber(int[] numbers) {
        int largest = numbers[0], secondLargest = numbers[0], smallest = numbers[0];

        for (int num:numbers) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest number is "+smallest);
        System.out.println("Second Largest number is "+secondLargest);
        System.out.println("Largest number is "+largest);

    }

    public static void findLargestSecondLargestAndSmallestNumber2(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length > 2) {
            System.out.println("Smallest number is "+numbers[0]);
            System.out.println("Second Largest number is "+numbers[numbers.length - 2]);
            System.out.println("Largest number is "+numbers[numbers.length - 1]);
        }
    }
}
