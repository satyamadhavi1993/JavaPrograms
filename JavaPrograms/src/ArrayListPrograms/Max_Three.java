import java.util.ArrayList;
import java.util.List;

public class Max_Three {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};
        maxThree(inputArray);
    }

    public static void maxThree(int[] inputArray) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(inputArray, 0, new ArrayList<>(), combinations, 3);

        // Print each combination
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static void generateCombinations(int[] arr, int index, List<Integer> current, List<List<Integer>> result, int r) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == arr.length) {
            return;
        }
        // Include current element in the combination
        current.add(arr[index]);
        generateCombinations(arr, index + 1, current, result, r);
        // Exclude current element from the combination
        current.remove(current.size() - 1);
        generateCombinations(arr, index + 1, current, result, r);
    }
}
