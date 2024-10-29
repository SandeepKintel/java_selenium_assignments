package Assignment65_Aug24;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Exp {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		//ts.add("Ram");
		//ts.add("Shyam");
		//ts.add(null);
		//ts.add("Shyam");
		//ts.add(null);
		ts.add(34);
		//ts.add(null);
		ts.add(23);
		ts.add(45);
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
