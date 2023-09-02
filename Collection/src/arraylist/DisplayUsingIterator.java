package arraylist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class DisplayUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name[]= {"uday","rohan","ajay","Omakr","akshay"};
		
		List<String> al=Arrays.asList(name);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=============================");
		
		ListIterator<String> itr2=al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
		System.out.println("=============================");
		
		ListIterator<String> itr3=al.listIterator();
		while(itr3.hasNext()) {
			itr3.next();
		}
		while(itr3.hasPrevious()) {
			System.out.println(itr3.previous());
		}
		System.out.println("=============================");
		
		ArrayList alm= new ArrayList();
		LinkedList all= new LinkedList();
		
		
		System.out.println(alm instanceof Serializable);
		System.out.println(all instanceof RandomAccess);

	}

}
