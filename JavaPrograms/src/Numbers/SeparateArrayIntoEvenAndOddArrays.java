package Numbers;

import java.util.ArrayList;
import java.util.List;

public class SeparateArrayIntoEvenAndOddArrays {
    public static void main(String[] args) {
        int[] nums = new int[] { 23, 53, 12, 57, 22, 67, 94, 1, 43, 100, 0, 34 };
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int num:nums) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        System.out.println("Odd list "+oddList);
        System.out.println("Even list "+evenList);
    }
}
