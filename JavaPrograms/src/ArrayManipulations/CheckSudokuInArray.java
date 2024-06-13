package ArrayManipulations;

import java.util.Arrays;

public class CheckSudokuInArray {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
            };
        verifySudoku(sudoku);
        System.out.println("Valid Sudoku :: "+verifySudoku(sudoku));
        
    }

    public static boolean verifySudoku(int[][] sudoku) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] block = new int[9];

        // Check each row
        for (int i = 0; i < 9; i++) {
            block = sudoku[i];
            if (! isValid(block, arr)) {
                return false;
            }
        }

        // Check each column
        for (int i = 0; i < 9; i++) {
            block = new int[9];
            for (int j = 0; j < 9; j++) {
                block[j] = sudoku[j][i];
            }
            if (! isValid(block, arr)) {
                return false;
            }
        }

        // Check each 3 x 3 block
        block = new int[9];
        int block_var = 0;
        int i2 = 0;
        for (int i1 = 0; i1 < 3; i1++) {
            int j2 = 0;
            int row = i2;
            for (int j1 = 0; j1 < 3; j1++) {
                block_var = 0;
                block = new int[9];
                int cell = j2;
                for (i2 = row; i2 < row + 3; i2++) {
                    for (j2 = cell; j2 < cell + 3; j2++) {
                        block[block_var] = sudoku[i2][j2];
                        block_var++;
                    }
                }
                if (!isValid(block, arr)) {
                    // System.out.println("Block i = " + i + " and j = " + j);
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        if (! Arrays.equals(arr1, arr2)) {
            return false;
        }
        return true;
    }
}
