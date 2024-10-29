package Assignment34_July24;
public class Asg34_PalindromeString {
	public static void main(String[] args) {
		String input = "madam";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			output = output + ch;
		}
		boolean b1= input.equals(output);
		 if(b1==true) {
			 System.out.println("String is Palindrome");
		 }else {
			 System.out.println("String is not Palindrome");
		 }
	}
}
