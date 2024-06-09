package ArraysManipulations;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(344, 523, 542, 11, 3, 8, 67, 35, 87, 14, 76, 12, 35, 11, 74, 423, 239));
        
    }
    public static void mergeSort(ArrayList<Integer> numbers) {
        int len = numbers.size();
        int left = 0;
        int right = numbers.size() - 1;
        int mid = (left+right)/2;
        

        

    }

    public static void merge(ArrayList<Integer> numbers, int left, int right) {
        int len = numbers.size();
        ArrayList<Integer>  leftArray = new ArrayList<Integer>();
        ArrayList<Integer>  rightArray = new ArrayList<Integer>();
        int mid = (left+right)/2;
        for(Integer num:numbers) {
            if(num <= mid) {
                leftArray.add(num);
            } else {
                rightArray.add(num);
            }
        }
    }

    
}
