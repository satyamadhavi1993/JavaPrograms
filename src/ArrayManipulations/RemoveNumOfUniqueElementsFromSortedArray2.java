package ArrayManipulations;

public class RemoveNumOfUniqueElementsFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int insert_index = 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                count++;
                if (count <= 2)
                    insert_index++;
            }
            else {
                insert_index++;
                count = 0;
            }
        }
        return insert_index;
    }
}
