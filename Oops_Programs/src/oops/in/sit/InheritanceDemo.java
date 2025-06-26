package oops.in.sit;

public class InheritanceDemo {
	public static void main(String[] args) {
		Fish shark=new Fish();
		shark.swim();
		shark.eat();
		
		
		Dog dobby=new Dog();
		dobby.breathe();
		dobby.legs=4;
		System.out.println(dobby.legs);
		
		
	}

}
//Base class
class Animal{
	
	String color;
	
	void eat() {
		System.out.println("eats");
	}
	void breathe() {
		System.out.println("breathes");
	}
}
//Derived Class
class  Fish extends Animal{
	int fins;
	void swim() {
		System.out.println("swim is water");
	}
	
}
class Mammal extends Animal{
	int legs;
}
class Dog extends Mammal{
	String bread;
}

