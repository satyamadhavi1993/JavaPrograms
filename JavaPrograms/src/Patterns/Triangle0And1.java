package Patterns;

public class Triangle0And1 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				String value = (sum % 2 == 0) ? "1" : "0";
				System.out.println(value);			}
			System.out.println();
		}

	}

}
