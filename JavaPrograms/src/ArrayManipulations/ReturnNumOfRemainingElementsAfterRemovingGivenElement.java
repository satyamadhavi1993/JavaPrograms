package ArrayManipulations;

public class ReturnNumOfRemainingElementsAfterRemovingGivenElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 7};
        int k = 2;
        System.out.println(removeElement(nums, k));
    }

    public static int removeElement(int[] nums, int k) {
        int index = 0;
        for (int num:nums) {
            if (num != k) {
                index++;
            }
        }
        return index;
    }
}
