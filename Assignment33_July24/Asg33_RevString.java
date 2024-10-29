package Assignment33_July24;

public class Asg33_RevString {
	public static void main(String[] args) {
		String input = "Sandeep";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			output = output + ch;
			}
		    System.out.println(output);
		}

}
