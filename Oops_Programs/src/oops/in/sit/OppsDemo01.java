package oops.in.sit;

public class OppsDemo01 {
	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.setColor("Blue");
		System.out.println(p1.color);
		p1.setTip(3);
		System.out.println(p1.tip);
		
		BankAccount myAcc=new  BankAccount();
		myAcc.username="Bipsh";
		myAcc.setPassword("abc@123");
		System.out.println(myAcc.getUsername());
		System.out.println(myAcc.getPassword());
		
		
		
		Student s=new Student();
		s.name="Shital";
		s.age=12;
		s.calPercentage(45,48,40);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.percentage);
		
	}

}
	class BankAccount{
		public String username;
		private String password;
		
		String getUsername() {
			return this.username;
		}
		String getPassword() {
			return this.password;
		}
		public void setPassword(String pwd) {
			password=pwd;
			
		}
	}

class Pen{
	String color;
	int tip;
	
	void setColor(String newColor) {
		color=newColor;
		
	}
	void setTip(int newTip) {
		tip=newTip;
	}
}
class Student{
	String name;
	int age;
	int arr[];
	float percentage;
	void calPercentage(int phy,int chem,int math) {
		percentage=(phy+chem+math)/3;
	}
}
	

