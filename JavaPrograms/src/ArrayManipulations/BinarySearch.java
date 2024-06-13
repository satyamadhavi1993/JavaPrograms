package ArrayManipulations;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("Index is "+binarySearch(intArray, 23));
        System.out.println("Index is "+binarySearchUsingRecursion(intArray, 111));
    }

    public static int binarySearch(int[] nums, int number_to_find) {
        Arrays.sort(nums);
        
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            if (number_to_find == nums[mid]) 
                return mid;
            else if (number_to_find > nums[mid]){
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }

    public static int binarySearchUsingRecursion2(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (target == nums[mid]) {
            return mid; 
        } 
        else if (target > nums[mid]){
            return binarySearchUsingRecursion2(nums, target, mid+1, high);
        }
        else {
            return binarySearchUsingRecursion2(nums, target, low, mid -1);
        }
    }

    public static int binarySearchUsingRecursion(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        return binarySearchUsingRecursion2(nums, target, low, high);
    }
}
