package dsa.array.in.sit;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		
		int arr[]= {7,2,5,9,1,5};
		
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	System.out.println(Arrays.toString(arr));
		
	}
}
