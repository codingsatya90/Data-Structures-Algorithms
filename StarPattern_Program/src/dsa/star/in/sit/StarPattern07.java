package dsa.star.in.sit;

public class StarPattern07 {
	public static void main(String[] args) {
		//outer loop
		for(int i=5; i>=1; i--) {
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
