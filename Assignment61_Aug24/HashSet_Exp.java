package Assignment61_Aug24;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Exp {
	public static void main(String[] args) {
		HashSet hst = new HashSet();
		hst.add("Ram");
		hst.add("shyam");
		hst.add(null);
		hst.add("Raman");
		hst.add("aman");
		hst.add(null);
		hst.add(45);
		hst.add(67);
		hst.add(32);
		hst.add(76);
		System.out.println(hst);
		
		Iterator i1 = hst.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
