package Assignmnet36_July24;
public class Asg36_FindCharString {
	public static void main(String[] args) {
		String input = "Total numbers of students are 48 and their id are 12@_&_%";
		int countalpha = 0;
		int countspace = 0;
		int countdigit = 0;
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isAlphabetic(ch)) {
				countalpha++;
				}
			if(Character.isSpaceChar(ch)) {
				countspace++;
				}
			if(Character.isDigit(ch)) {
				countdigit++;
				}
			}
		System.out.println("Totla numbers of Alphbets are "+countalpha);
		System.out.println("Totla numbers of Spaces are "+countspace);
		System.out.println("Totla numbers of Numerics are "+countdigit);
		int countspecialchar = input.length() - (countalpha+countspace+countdigit);
		System.out.println("Totla numbers of Sprcial Character are "+countspecialchar);
		}
	}