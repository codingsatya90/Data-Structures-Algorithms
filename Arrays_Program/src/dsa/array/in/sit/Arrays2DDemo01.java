package dsa.array.in.sit;

import java.util.Scanner;

public class Arrays2DDemo01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] number =new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<cols; j++) {
				number[i][j]=sc.nextInt();
			}
			
			//for
		}
	}

}
