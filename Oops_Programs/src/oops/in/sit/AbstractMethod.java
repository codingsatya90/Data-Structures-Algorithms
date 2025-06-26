package oops.in.sit;

public class AbstractMethod {

	public static void main(String[] args) {

		Horse h=new Horse();
		h.eat();
		h.walk();
		System.out.println(h.color);
//		h.changeColor();
		
		Checken c=new Checken();
		c.eat();
		c.walk();
		//c.changeColor();
		
	}
}

abstract class Animal2 {
	String color;
	
	Animal2(){
		color="brown";
	}
	void eat() {
		System.out.println("animal eats");
	}

	abstract void walk();
}

class Horse extends Animal {
	
	void changeColor() {
		color="Drak brown";
	}
	void walk() {
		System.out.println("walk on 4 legs");
	}
}

class Checken extends Animal2 {
	void changeColor() {
		color="white";
	}
	void walk() {
		System.out.println("walks on 2 legs");
	}
}
