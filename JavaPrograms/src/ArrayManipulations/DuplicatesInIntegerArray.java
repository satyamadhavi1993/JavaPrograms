package ArrayManipulations;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;


public class DuplicatesInIntegerArray {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 1, 6, 3, 7, 8, 5, 4, 9 };
        removeDuplicateNumbers(numbers);
        duplicateNumbers(numbers);
    }

    public static void duplicateNumbers(int[] numbers) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int num:numbers) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        map1.forEach((k, v) -> System.out.println("Key is "+k+" and Value is "+v));
    }

    public static void removeDuplicateNumbers(int[] numbers) {
        // Set<Integer> nums = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        Set<Integer> nums = new HashSet<>();
        for(int num:numbers) {
            nums.add(num);
        }
        System.out.println(nums);
    }    
}
