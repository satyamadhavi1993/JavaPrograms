package ArrayManipulations;

import java.util.Arrays;

public class CheckIfArraysAreEqual {

    public static void main(String[] args) {
        int[] numbers1 = { 112, 120, 230, 850, 750, 950, 10 };
        int[] numbers2 = { 112, 120, 230, 850, 750, 950, 10 };
        int[] numbers3 = { 10, 112, 120, 230, 850, 750, 950};
        System.out.println(numbers1 == numbers2);
        System.out.println(numbers1.equals(numbers2));
        System.out.println(Arrays.equals(numbers1, numbers2));
        System.out.println(Arrays.equals(numbers1, numbers3));
        System.out.println(Arrays.compare(numbers1, numbers2));
    }

}