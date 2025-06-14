package dsa.function.in.sit;

import java.util.Scanner;

public class FindGreaterNumber {
	
	
	public static int FindGreaterNumber(int num1,int num2) {
		
		if(num1>num2) {
			System.out.println("num1 greater than num2");
		}else {
			System.out.println("num2 greater than num1");
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		FindGreaterNumber(a,b);
		
	}

}
