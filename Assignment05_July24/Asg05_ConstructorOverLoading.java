package Assignment05_July24;

public class Asg05_ConstructorOverLoading {
	Asg05_ConstructorOverLoading()
	{
		System.out.println("First Constructor");
	}
	
	Asg05_ConstructorOverLoading(String name)
	{
		System.out.println("First Constructor " + name);
	}
	
	Asg05_ConstructorOverLoading(String name, int number)
	{
		System.out.println("First Constructor");
	}
	
	public static void main(String[] args) {
		new Asg05_ConstructorOverLoading();
		new Asg05_ConstructorOverLoading("Second");
		new Asg05_ConstructorOverLoading("Ssandy", 2);
		
	}
	
}
