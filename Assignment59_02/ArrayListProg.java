package Assignment59_02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListProg {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ram");
		al.add("Shyam");
		al.add(null);
		al.add("Ram");
		al.add("Shyam");
		al.add(1);
		al.add(null);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(8);
		al.add(null);
		al.add(6);
		al.add(9);
		System.out.println(al);
		Iterator i1= al.iterator();
		
		ArrayList a2 = new ArrayList();
		a2.add(13);
		a2.add(21);
		a2.add(2);
		a2.add(39);
		
		Collections.sort(a2);
		System.out.println(a2);
		
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		
		
	}

}
