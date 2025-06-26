package oops.in.sit;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//create student object
		Student3 s=new Student3();
		
		String n=sc.next();
		int m=sc.nextInt();
		System.out.println("Enter name:");
	      s.name=n;
	      System.out.println("Enter marks");
	      s.marks=m;
		System.out.println(s.name);
		System.out.println(s.marks);
	}

}
class Student3{
	String name;
	int marks;
}
