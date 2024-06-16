package Patterns;

public class InvertedAndRotatedHalfPyramid {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
