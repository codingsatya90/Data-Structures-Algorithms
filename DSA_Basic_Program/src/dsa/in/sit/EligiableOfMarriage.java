package dsa.in.sit;

import java.util.Scanner;

public class EligiableOfMarriage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligiable of marriage");
		}else {
			System.out.println("Not Eligiable of marriage");
		}
	}
}
