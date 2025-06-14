package dsa.function.in.sit;

import java.util.Scanner;

public class SumOfTwoNumber {
	public static int sumNumber(int a,int b) {
		
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		int sum=sumNumber(num1,num2);
		System.out.println(sum);
	}

}
