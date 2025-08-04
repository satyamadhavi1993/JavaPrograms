package ArrayManipulations;

import java.util.Scanner;

public class FindAnElementInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns :: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value of column " + (j + 1) + " of row " + (i + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number to search :: ");
        int numberToSearch = sc.nextInt();

        for (int i = 0; i< row; i++){
            for (int j = 0; j<col; j++){
                if (arr[i][j] == numberToSearch) {
                    System.out.println("Given number is found in Row "+(i+1) +" Column "+(j+1));
                }
            }
        }

        sc.close();
    }

}
