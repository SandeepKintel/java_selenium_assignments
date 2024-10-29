package Assignments41_July24;
import java.util.Arrays;

public class Asg41_RevArray {
	public static void main(String[] args) {
		int[] marks = new int[3];
		marks[0] = 45;
		marks[1] = 80;
		marks[2] = 95;
		
		int[] revmarks = new int[3];
		
		for(int i=marks.length-1, k=0; i>=0; i--, k++) {
			
			revmarks[k] = marks[i];
			
		}
		System.out.println(Arrays.toString(revmarks));
	}

}
