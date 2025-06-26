package oops.in.sit;

public class MethodOverloding {
	
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
	    System.out.println(calc.sum(34,12));
	    System.out.println(calc.sum(22.4f,12));
	    System.out.println(calc.sum(31,17,45));
	}

}
class Calculator{
	
	int sum(int a,int b) {
		return a+b;
	}
	float sum(float a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
}
