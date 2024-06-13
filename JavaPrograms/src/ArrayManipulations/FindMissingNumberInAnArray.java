package ArrayManipulations;

import java.util.Arrays;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        // int[] arr = { -27, -24, -21, -18, -15, -12, -9, -6, -3, 0, 3, 6, 9, 15, 18, 21, 24, 27, 30 };
        int[] arr = { -3, -2, -1,0, 1, 2, 3, 4, 5, 7, 8, 9 };
        missingNumber(arr);
        usingBinarySearch(arr);
    }

    public static void missingNumber(int[] arr) {
        int diff = Math.abs(arr[0]-arr[1]);
        int j = 0;
        for (int i = arr[0]; i < arr[arr.length-1]; i += diff) {
            if (arr[j] != i) {
                System.out.println("Missing number is "+i);
                break;
            }
            j++;
        }
    }

    public static void usingBinarySearch(int[] arr) {
        int searchnumber = arr[0];
        int found = 0;
        int diff = Math.abs(arr[0]-arr[1]);
        for(int i = 0; i < arr.length; i++) {
            found = Arrays.binarySearch(arr, searchnumber);
            if (found < 0) {
                System.out.println("Missing number is : "+searchnumber);
                break;
            }
            searchnumber += diff;
        }
    }
}
