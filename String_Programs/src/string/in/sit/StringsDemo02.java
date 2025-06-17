package string.in.sit;

import java.util.Scanner;

public class StringsDemo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
       
		//concatenation 
		String fullName = firstName + lastName;
		System.out.println("Full Name:" + fullName);
		
		//charAt
		for(int i=0; i<fullName.length();i++) {
			System.out.print(fullName.charAt(i)+" ");
		}
	}

}
