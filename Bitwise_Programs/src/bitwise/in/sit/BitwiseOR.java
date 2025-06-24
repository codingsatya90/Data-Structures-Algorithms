package bitwise.in.sit;

import java.util.Scanner;

public class BitwiseOR {
	private int c;
	int bitWise(int a,int b) {
		 this.c=a|b;
		return c;
	}
 void display() {
	
	System.out.println(c);
 }
	public static void main(String[] args) {
		BitwiseOR or=new BitwiseOR();	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first  number:");
		int a=sc.nextInt();
		System.out.println("Enter Second  number:");
		int b=sc.nextInt();
		
		or.bitWise(a, b);
		or.display();
		
		
		
	}

}
