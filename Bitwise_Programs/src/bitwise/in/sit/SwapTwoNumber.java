package bitwise.in.sit;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int x=4,y=7;
		System.out.println("Before swap: x="+x+"and y="+y);
		//swap using xor
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swap: x="+x+"and y="+y);
		
	}
}
