package Assignment49_Aug24;

public class Asg49_StringException {
	public static void main(String[] args) {
		String name = "sandeep";
		try {
			for(int i=0; i<=name.length(); i++) {
				char ch = name.charAt(i);
				System.out.println(ch);
		}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Enter the correct size");

		}

		
	}

}
