package dsa.star.in.sit;

public class StarPattern05 {

	public static void main(String[] args) {

		int n = 5;
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
