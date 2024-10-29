package Assignment48_Aug24;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Asg48_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Limit");
		try {
		int marks[] = new int[sc.nextInt()];
		for(int i=0; i<=marks.length; i++) {
			System.out.println(marks[i]);
		}
		}catch(InputMismatchException e) {
			System.out.println("Please Enter the Integer Value only");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the correct value");
		}
	}
}
