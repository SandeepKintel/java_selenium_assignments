package Assignments40_July24;

import java.util.Arrays;

public class Asg40_CopyArray {
	public static void main(String[] args) {
	String[] name = new String[3];
	name[0] = "Sandy";
	name[1] = "Rohit";
	name[2] = "Atul";
	
	String[] copyname = new String[3];
	
	for(int i=0; i<name.length; i++) {
		copyname[i] = name[i];
	}
	System.out.println(Arrays.toString(copyname));
	}
	
}
