package Patterns;

public class StarPattern {

	public static void main(String[] args) {
//		rightTriangleStarPattern(5);
		leftTriangleStarPattern(5);
//		pyramidPattern(5);
	}

	public static void rightTriangleStarPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void leftTriangleStarPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyramindPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void pyramidPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
