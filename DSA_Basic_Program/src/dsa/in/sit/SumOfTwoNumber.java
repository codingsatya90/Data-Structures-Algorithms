package dsa.in.sit;

import java.util.Scanner;

public class SumOfTwoNumber {

	int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		SumOfTwoNumber stn = new SumOfTwoNumber();
		
		System.out.println("Enter no a:");
		int a=sc.nextInt();
		
		System.out.println("Enter no b:");
		int b=sc.nextInt();
		
		int sum=stn.sum(a, b);
		System.out.println("Sum:"+sum);
		
	}
}
