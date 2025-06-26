package oops.in.sit;

public class MethodOverriding {
	public static void main(String[] args) {
		
		Dear d=new Dear();
		d.eat();
	}

}
class Animal1{
	
	void eat() {
		System.out.println("eat anything");
	}
}
class Dear{
	
	void eat() {
		System.out.println("eat grass");
	}
}
