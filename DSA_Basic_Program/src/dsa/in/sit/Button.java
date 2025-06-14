package dsa.in.sit;

import java.util.Scanner;

public class Button {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr Button number:");
		
		int button=sc.nextInt();
		
		if(1==button) {
			System.out.println("Hello");
		}else if(2==button) {
			System.out.println("Namaste");
		}else if(3==button){
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid Button");
		}
		
	}

}
