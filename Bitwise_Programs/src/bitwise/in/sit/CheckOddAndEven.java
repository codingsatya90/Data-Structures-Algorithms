package bitwise.in.sit;

import java.util.Scanner;

public class CheckOddAndEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=n&1;
		
		if(result==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
