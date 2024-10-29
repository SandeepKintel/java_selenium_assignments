package Assignments_28_July24;
class SuperClass{
	void super_Method() {
		System.out.println("This is the Super Class Method");
	}
	
}

class SubClass extends SuperClass{
	void super_Method() {
		super.super_Method();
		System.out.println("This is the Child Class Method");
	}
}

public class Asg_SuperKeywords {
	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		sc.super_Method();
		
	}
	
}
