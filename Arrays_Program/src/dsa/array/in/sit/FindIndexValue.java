package dsa.array.in.sit;

import java.util.Scanner;

public class FindIndexValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array length:");
		int size=sc.nextInt();
		
		int numbers[]=new int[size];
		
		//input
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter x number:");
		int x=sc.nextInt();
		
		for(int i=0; i<size;i++) {
			if(numbers[i]==x) {
				System.out.println("X found at index:"+i);
			}
		}
	}
}
