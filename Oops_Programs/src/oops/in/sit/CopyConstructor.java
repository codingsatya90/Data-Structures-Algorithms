package oops.in.sit;

public class CopyConstructor {
public static void main(String[] args) {
	

	Student2 s1=new Student2();
	s1.name="Hari";
	s1.roll=4;
	s1.password="dsnjdk";
	s1.marks[0]=100;
	s1.marks[1]=95;
	s1.marks[2]=80;
	
	Student2 s2=new Student2(s1); //copy
	s2.password="xyz";
	s1.marks[2]=90;
	for(int i=0; i<3;i++) {
		System.out.println(s2.marks[i]);
	}
	
	
	System.out.println(s1.name);
	System.out.println(s1.roll);
	System.out.println(s1.password);
	
}
}
class Student2{
	String name;
	int roll;
	String password;
	int marks[];
	
	
	
	// shallow copy constructor
//	Student2(Student2 s1){
//		marks=new int[3];
//		this.name=s1.name;
//		this.roll=s1.roll;
//		this.marks=s1.marks;
//		
//	}
	
	//deep copy constructor
		Student2(Student2 s1){
			marks=new int[3];
			this.name=s1.name;
			this.roll=s1.roll;
			
			for(int i=0; i<marks.length;i++) {
				this.marks[i]=s1.marks[i]; 
			}
		}
		
	

	Student2(){
		marks=new int[3];
		System.out.println("constructor is called...");
		
	}
	Student2(String name){
		marks=new int[3];
		this.name=name;
	}
	Student2(int roll){
		marks=new int[3];
		this.roll=roll;
	}
}
