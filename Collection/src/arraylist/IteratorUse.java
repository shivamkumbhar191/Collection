package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorUse {

	public static void main(String[] args) {
		
		ArrayList<Object> al= new ArrayList<>();
		al.add("shivam");
		al.add(104);
		al.add(50.5f);
		al.add(true);
		al.add('c');
		al.add(50.80);
		System.out.println(al);
		
		System.out.println("======================");
		
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("======================");
		
		ListIterator<Object> itr2=al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
		System.out.println("======================");
		
		ListIterator<Object> itr3=al.listIterator();
		while(itr3.hasNext()) {
			itr3.next();
		}
		while(itr3.hasPrevious()) {
			itr3.previous();
		}

	}

}
