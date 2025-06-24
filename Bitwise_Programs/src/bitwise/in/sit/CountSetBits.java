package bitwise.in.sit;

public class CountSetBits {
	
	public static int countSetBits(int n) {
		int count = 0;

		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;  // Right shift by 1 to check next bit
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countSetBits(5));  // Output: 2 (binary 101)
	}
}
