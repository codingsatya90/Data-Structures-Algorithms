package dsa.array.in.sit;

import java.util.Scanner;

public class FindMaxMinValues {
	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 1, 7, 3 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
			if (arr[i] <= min) {
				min = arr[i];
			}

		}

		System.out.println("Minimum number of Arrays:"+min);
		System.out.println("Maximun number of Arrays:"+max);
	}

}
