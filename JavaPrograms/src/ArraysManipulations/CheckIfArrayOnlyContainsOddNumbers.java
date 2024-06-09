package ArraysManipulations;
public class CheckIfArrayOnlyContainsOddNumbers {
    public static void main(String[] args) {
        // Check list of integers only contain odd numbers

        int[] intArr = {1, 3, 5, 7, 9, 43, 33};
        int[] intArr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Contains odd :: "+containsOdd(intArr));
        System.out.println("Contains odd :: "+containsOdd(intArr2));
        
    }

    public static boolean containsOdd(int[] intArr) {
        for (int i:intArr) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    } 
}
