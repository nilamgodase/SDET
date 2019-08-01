package Functional;

import java.util.Scanner;
public class FlipCoin {
	public static void main(String[] args)

	{
		int choice = 0;
		do {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number");
			//take the input number from user
			int number = scanner.nextInt();
			Utility.flipcoin(number);
			System.out.println("press 1 to continue");
			choice = scanner.nextInt();
		} while (choice == 1);

	}// End Main
}// End Class