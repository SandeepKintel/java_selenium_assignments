package Assignment59_Aug24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Exp {
	public static void main(String[] args) {
		ArrayList arlist = new ArrayList();
		arlist.add("Sam");
		arlist.add(null);
		arlist.add("Sam");
		arlist.add("Sam");
		arlist.add("Shyam");
		arlist.add("Raman");
		arlist.add(4);
		arlist.add(6);
		arlist.add(null);
		arlist.add(8);
		arlist.add(2);
		arlist.add(null);
		System.out.println(arlist);
		
		System.out.println("Iterate using List Iterator");
		ListIterator l1=arlist.listIterator();
		
		while(l1.hasNext()){
			System.out.println(l1.next());
		}
		
		System.out.println("Iterate using Iterator");
		Iterator l2 = arlist.iterator();
		
		while(l2.hasNext()){
			System.out.println(l2.next());
		}
		
		
		
		
	}

}
