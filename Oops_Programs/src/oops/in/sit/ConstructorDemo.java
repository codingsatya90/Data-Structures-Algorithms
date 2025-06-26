package oops.in.sit;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		Student1 s2=new Student1("Raushan");
		Student1 s3=new Student1(6);
		
		System.out.println(s2.name);
		System.out.println(s3.roll);
		
	}

}
class Student1{
	String name;
	int roll;
	
	Student1(){
		System.out.println("constructor is called...");
		
	}
	Student1(String name){
		this.name=name;
	}
	Student1(int roll){
		this.roll=roll;
	}
	
}
