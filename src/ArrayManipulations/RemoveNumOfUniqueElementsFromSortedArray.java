package ArrayManipulations;

public class RemoveNumOfUniqueElementsFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int insert_index = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                insert_index++;
            }
        }
        return insert_index;
    }
}
