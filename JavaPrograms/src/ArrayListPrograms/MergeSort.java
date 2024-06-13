package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(344, 523, -542, 11, 3, 8, 67, -35, 87, 14, 76, -12, 35, 11, 74, -423, 239, 0));
        System.out.println(mergeSort(numbers));
        
    }
    public static List<Integer> mergeSort(List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }
        return divide(numbers, 0, numbers.size() - 1);
    }

    public static List<Integer> divide(List<Integer> numbers, int low, int high) {
        if (low == high) {
            return new ArrayList<Integer>(){{
                add(numbers.get(low));
            }};
        }
        int mid = (low + high)/2;
        List<Integer> leftArray = divide(numbers, low, mid);
        List<Integer> rightArray = divide(numbers, mid + 1, high);
        return merge(leftArray, rightArray);
    }

    public static List<Integer> merge(List<Integer> leftArray, List<Integer> rightArray) {
        List<Integer> sortedList = new ArrayList<Integer>();
        int pointer1 = 0, pointer2 = 0;
        int leftArraySize = leftArray.size();
        int rightArraySize = rightArray.size();
        while (pointer1 < leftArraySize || pointer2 < rightArraySize) {
            if (pointer2 == rightArraySize) {
                sortedList.add(leftArray.get(pointer1));
                pointer1++;
            }
            else if (pointer1 == leftArraySize) {
                sortedList.add(rightArray.get(pointer2));
                pointer2++;
            }
            else if (leftArray.get(pointer1) <= rightArray.get(pointer2)) {
                sortedList.add(leftArray.get(pointer1));
                pointer1++;
            }
            else if (leftArray.get(pointer1) > rightArray.get(pointer2)) {
                sortedList.add(rightArray.get(pointer2));
                pointer2++;
            }
        }

        return sortedList;
    }
}
