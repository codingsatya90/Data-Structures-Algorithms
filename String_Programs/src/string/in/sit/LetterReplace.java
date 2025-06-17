package string.in.sit;

import java.util.Scanner;

public class LetterReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='e') {
				result=result+'i';
			}else {
				result +=str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
