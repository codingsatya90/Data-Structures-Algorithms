package dsa.star.in.sit;

public class Palindromic_Pattern {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			//1t half numbers
			for(int k=i; k>=1;k--) {
				System.out.print(k);
			}
			//2nd half numbers
			for(int j=2; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
