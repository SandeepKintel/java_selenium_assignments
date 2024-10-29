package Assignments42_July24;

public class Asg42_AvgOfArray {
	public static void main(String[] args) {
		int[] marks = new int[4];
		marks[0] = 45;
		marks[1] = 60;
		marks[2] = 65;
		marks[3] = 75;
		
		double sum=0;
		
		for(int i=0; i<marks.length; i++) {
			sum = sum + marks[i];
		}
		
		double avgArray = sum/4;
		System.out.println("The average of the given array is "+ avgArray);
	}

}
