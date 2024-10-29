package Assignment37_July24;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Asg37_ArrayEquals {
	public static void main(String[] args) {
		int[] rollno = new int[3];
		int[] rollno1 = new int[3];
		
		rollno[0]= 34;
		rollno[1]= 40;
		rollno[2]= 45;
			
		rollno1[0]= 34;
		rollno1[1]= 40;
		rollno1[2]= 45;
		
		boolean b1 =  Arrays.equals(rollno, rollno1);
		if(b1==true) {
			System.out.println("The Two Arrays are Equal");
		}else {
			System.out.println("Not Equals");
		}
		
	}

}
