package Assignment60_Aug24;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExp {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add("Ram");
		ls.add("Shyam");
		ls.add(null);
		ls.add("Ram");
		ls.add(2);
		ls.add(null);
		ls.add(5);
		ls.add(6);
		ls.add(8);
		ls.add(null);
		
		LinkedList ls2 = new LinkedList();
		ls2.add(29);
		ls2.add(101);
		ls2.add(12);
		ls2.add(34);
		
		Collections.sort(ls2);
		System.out.println(ls2);
		
		
		System.out.println(ls);
		Iterator it = ls.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator l1 = ls.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
	}

}
