package dsa.star.in.sit;

public class StarPattern04 {
public static void main(String[] args) {
	
	int n = 4;

	// outer loop
	for (int i = 1; i <= n; i++) {
		// inner loop
		for (int j = i; j<= n; j++) {
			System.out.print("*");

		}
		System.out.println();
	}
}

}
