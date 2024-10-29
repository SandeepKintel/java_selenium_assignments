package Assignment38_July24;
import java.util.Arrays;
import java.util.Scanner;

public class Asg38_ArrayScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] input = new double[3];
		
		for(int i=0; i<input.length; i++) {
			input[i]=sc.nextDouble();
		}
		
		System.out.println(Arrays.toString(input));
	}

}
