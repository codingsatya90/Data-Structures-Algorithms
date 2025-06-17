package string.in.sit;

import java.util.Scanner;

public class Strings01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String array[] = new String[size];

		int toLength = 0;

		for (int i = 0; i < size; i++) {
           array[i]=sc.next();
           toLength =toLength+array[i].length();
		}
		System.out.println(toLength);
	}

}
