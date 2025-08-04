package Patterns;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int n=3;
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Alternative Solution
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
