package Numbers;

import java.util.Scanner;

public class CheckIfEnteredNumberIsEvenOrOdd {
    public static void main(String[] args) {
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		while (!quit) {
			System.out.println("Enter option - 1 to continue, 0 to quit::");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter a number::");
				scan = new Scanner(System.in);
				int num = scan.nextInt();
				evenOrOdd(num);
				break;
			case 0:
				System.out.println("Exiting the loop");
				quit = true;
				break;
			}
		}
		scan.close();
	}

	public static void evenOrOdd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}
}
