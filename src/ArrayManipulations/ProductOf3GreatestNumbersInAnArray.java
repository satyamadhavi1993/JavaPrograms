package ArrayManipulations;

public class ProductOf3GreatestNumbersInAnArray {
    public static void main(String[] args) {
        int[] numbers = {34, 23, -52, 11, 3, 8, 67, -35, 87, 14, 76, -12, 35, 11, 74, -43, 39, 0};
        int[] sortedNumbers = mergeSort(numbers);
        if (sortedNumbers.length >= 3) {
            int length = sortedNumbers.length;
            System.out.println("Product of 3 greatest numbers in an Array: "+ (sortedNumbers[length - 1] * sortedNumbers[length - 2]
                                                                                * sortedNumbers[length - 3]));
        }
    }

    public static int[] mergeSort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }
        return divide(numbers, 0, numbers.length - 1);
    }

    public static int[] divide(int[] numbers, int low, int high) {
        if (low == high) {
            return new int[]{numbers[low]};
        }
        int mid = (low + high)/2;
        int[] leftArray = divide(numbers, low, mid);
        int[] rightArray = divide(numbers, mid + 1, high);
        return merge(leftArray, rightArray);
    }

    public static int[] merge(int[] leftArray, int[] rightArray) {
        int pointer1 = 0, pointer2 = 0;
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int[] sortedList = new int[leftArraySize + rightArraySize];
        int index = 0;
        while (pointer1 < leftArraySize || pointer2 < rightArraySize) {
            if (pointer2 == rightArraySize) {
                sortedList[index++] = leftArray[pointer1++];            
            }
            else if (pointer1 == leftArraySize) {
                sortedList[index++] = rightArray[pointer2++];
            }
            else if (leftArray[pointer1] <= rightArray[pointer2]) {
                sortedList[index++] = leftArray[pointer1++];      
            }
            else if (leftArray[pointer1] > rightArray[pointer2]) {
                sortedList[index++] = rightArray[pointer2++];
            }
        }

        return sortedList;
    }
}
