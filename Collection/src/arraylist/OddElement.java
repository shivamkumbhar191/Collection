package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddElement {
	
	public static void displayOdd(ArrayList al) {
		
		Iterator itr = al.iterator();
		itr.next();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.next();
		}
		
	}
public static void displayEven(ArrayList al) {
		Iterator<List> itr=al.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		itr.next();
//		while(itr.hasNext()) {
//			//itr.next();
//			System.out.println(itr.next());
//		}
	}
}

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("shivam");
		al.add("aarya");
		al.add("ayush");
		al.add("kiran");
		al.add("khushi");
	//	al.add("kiran");
		
		displayEven(al);
	//	displayOdd(al);
		Iterator<List> itr = al.iterator();
		
		
//		itr.next();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.next();
//		}

		
		//for even elements
//		System.out.println(itr.next());
//		while (itr.hasNext()) {
//			itr.next();
//			System.out.println(itr.next());
//		}
	}

}
