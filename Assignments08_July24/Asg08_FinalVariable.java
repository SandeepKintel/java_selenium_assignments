package Assignments08_July24;

import Assignments07_July24.Asg07_GlobalVariable;

public class Asg08_FinalVariable {
	
	float pie = 3.14f;
	
	int radius = 10;

	
	void AreaOfCircle() {
		
		float area = pie*radius*radius;
		System.out.println("Area of Circle " + area);
	}
	
	void CircumferenceOfCircle() {
	
		float circum = 2*pie*radius;
		System.out.println("Circumference of Circle " + circum);
	}
	
	public static void main(String[] args) {
		Asg07_GlobalVariable asg = new Asg07_GlobalVariable();
		asg.AreaOfCircle();
		asg.CircumferenceOfCircle();
	}

}
