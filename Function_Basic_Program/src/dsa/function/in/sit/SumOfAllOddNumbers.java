package dsa.function.in.sit;

import java.util.Scanner;

public class SumOfAllOddNumbers {
	public static int sumOfOddNumbers(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
	 	}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		int sum = sumOfOddNumbers(n);
		System.out.println(sum);
	}
}
