package dsa.loop.in.sit;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Table Number:");
		int n=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
