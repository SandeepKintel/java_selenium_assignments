package Assignments07_July24;

public class Asg07_GlobalVariable {
	
	final float pie = 3.14f;
	
	int radius = 10;

	
	public void AreaOfCircle() {
		//float pie=this.pie;
		int radius = 10;
		
		float area = pie*radius*radius;
		System.out.println("Area of Circle " + area);
	}
	
	void CircumferenceOfCircle() {
		int radius2= 12;
	
		float circum = 2*pie*radius2;
		System.out.println("Circumference of Circle " + circum);
	}
	
	public static void main(String[] args) {
		Asg07_GlobalVariable asg = new Asg07_GlobalVariable();
		asg.AreaOfCircle();
		asg.CircumferenceOfCircle();
	}

}
