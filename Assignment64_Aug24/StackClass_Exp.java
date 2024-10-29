package Assignment64_Aug24;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackClass_Exp {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.add("Ram");
		st.add("Shyam");
		st.add(null);
		st.add("Shyam");
		st.add(null);
		st.add(34);
		st.add(null);
		st.add(23);
		st.add(45);
		System.out.println(st);
		
		System.out.println("Example of peek");
		System.out.println(st.peek()); // get the last value
		
		System.out.println("Example of pop");
		System.out.println(st.pop()); // get the last value and then delete the last value from the collection
		
		System.out.println("Example of push");
		System.out.println(st.push("last")); // get the last value and then delete the last value from the collection
		
		System.out.println("Iterate using iterator");
		Iterator i1 = st.iterator();
		
	    ListIterator l1 = st.listIterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		
		System.out.println("Iteration Perform by Enumeration");
		
		Enumeration en= st.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}
}
