package Assignment39_July24;
import java.util.Scanner;

public class Asg39_FindNoInArray {
	public static void main(String[] args) {
		int[] marks = new int[4];
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		
		Scanner sc = new Scanner(System.in);
		int givennum = sc.nextInt();
		
		for(int i=0; i<marks.length; i++) {
			if(givennum == marks[i]) {
				System.out.println("the given number is part of the Array");
				}
			}
		}
	}
