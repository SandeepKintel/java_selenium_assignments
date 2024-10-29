package Assignment47_Aug24;

public class Asg47_Exception {
	public static void main(String[] args) {
		int marks[] = new int[4];
		marks[0] = 34;
		marks[1] = 45;
		marks[2] = 78;
		marks[3] = 23;
		
		try {
			for(int i=0; i<=marks.length; i++) {
				System.out.println(marks[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Please continue the application process");
	}
		
	}
}
