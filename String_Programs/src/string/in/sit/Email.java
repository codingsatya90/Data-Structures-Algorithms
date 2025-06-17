package string.in.sit;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email:");
		
		String email=sc.next();
		String userName="";
		
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}else {
				userName=userName+email.charAt(i);
			}
		}
		System.out.println(userName);
	}

}
