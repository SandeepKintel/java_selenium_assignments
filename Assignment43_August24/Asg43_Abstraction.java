package Assignment43_August24;
abstract class Students{
	abstract void showName(String name);
	abstract void showId(int studentId);
}

public class Asg43_Abstraction extends Students {

	void showName(String name) {
		System.out.println("The Name of the student is "+ name);
	}

	void showId(int studentId) {
		System.out.println("The Id of the student is "+ studentId);
	}
	
	void registerStudent() {
		System.out.println("Student Registered successful");
	}
	public static void main(String[] args) {
		Asg43_Abstraction ab = new Asg43_Abstraction();
		ab.showName("Sandeep");
		ab.showId(430);
		ab.registerStudent();
		}
}
