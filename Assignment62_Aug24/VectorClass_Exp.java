package Assignment62_Aug24;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass_Exp {
	public static void main(String[] args) {
		Vector v1 = new Vector();
	    v1.addElement("Ram");
	    v1.addElement(null);
		v1.addElement("Shyam");
		v1.addElement("Gopi");
		v1.addElement(null);
		v1.addElement("Aham");
		v1.addElement(1);
		v1.addElement(2);
		v1.addElement(3);
		v1.addElement(3);
		v1.addElement("Aham");
		v1.addElement(null);
		System.out.println(v1);
		
		Enumeration ev = v1.elements();
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		
		System.out.println("By using Iterator");
		
			Iterator i1 = v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("By using ListIterator");
		
		ListIterator lt = v1.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("Backward Iteration");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
	}

}
