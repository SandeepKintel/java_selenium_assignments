package Assignments01_July24;

public class CallingNonStaticMethod {
	
	void show() {
		System.out.println("Calling the nonstatic method");
	}
	public static void main(String[] args) {
		CallingNonStaticMethod nonst = new CallingNonStaticMethod();
		nonst.show();
				
	}

}
