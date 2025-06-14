package dsa.function.in.sit;

import java.util.Scanner;

public class EligibleForVote {
	
	public static void vote(int age) {
		
		if(age >=18) {
			System.out.println("Eligible for Vote");
		}else {
			System.out.println("Not  Eligible for Vote");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		vote(age);
		
	}
	
	

}
