package dsa.in.sit;

import java.util.Scanner;

public class Button01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("Hello");
		break;
		case 2:System.out.println("Namaste");
		break;
		case 3:System.out.println("Bonjour");
		break;
		default:System.out.println("Invalid Button");
		}
	}

}
