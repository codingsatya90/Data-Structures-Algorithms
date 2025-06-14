package dsa.function.in.sit;

import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int positive = 0, negative = 0, zero = 0;
		char choice;

		do {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			} else {
				zero++;
			}

			System.out.print("Do you want to continue (y/n)? ");
			choice = input.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		


	       System.out.println("Positives : "+ positive);
	       System.out.println("Negatives : "+ negative);
	       System.out.println("Zeros : "+ zero);


	}

}
