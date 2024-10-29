package Assignment_31_July24;
class One{
	String name = "Sandeep";
	
	void Frist() {
		String name1= "Kuldeep";
		name1= this.name;
		System.out.println("My Name is "+ name1);
		
	}
}

public class Asg31_ThisKeyword {
	
	public static void main(String[] args) {
		One ob = new One();
		ob.Frist();
		
	}

}
