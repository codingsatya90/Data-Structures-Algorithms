package dsa.function.in.sit;

import java.util.Scanner;

public class Multiply {
	
	public static int multiply(int n1,int n2) {
		return n1*n2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(multiply(a,b));
	}
	

}
