package dsa.in.sit;

import java.util.Scanner;

public class CheckEqual_Greate_Lesser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enetr second number:");
		int y=sc.nextInt();
		
		if(x==y) {
			System.out.println("Equal");
		}else if(x>y) {
			System.out.println("x is greater");
		}else {
			System.out.println("x is lesser");
		}
	}

}
