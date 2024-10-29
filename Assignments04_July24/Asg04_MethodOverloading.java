package Assignments04_July24;

public class Asg04_MethodOverloading {
	
	static void ShowName() {
		System.out.println("Show Name");
	}
	
	void ShowName(String name) {
		System.out.println("Show Name as "+ name);
	}
	
	void ShowName(String name, int age, char C) {
		System.out.println("Show Details");
	}
	
	public static void main(String[] args) {
		Asg04_MethodOverloading.ShowName();
		
		Asg04_MethodOverloading asg04 = new Asg04_MethodOverloading();
		asg04.ShowName("Sanjay");
		asg04.ShowName("Sandy", 26, 'S');
	}
	

}
