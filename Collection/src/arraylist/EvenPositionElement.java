package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("zenith");
		al.add("ayush");
		al.add("Aqeeal");
		al.add("Sudarshan");
		al.add("vandan");

//		for (int i = 0; i < al.size(); i++) {
//			if (i % 2 == 0) {
//				System.out.println(al.get(i));
//			}
//		}

		Iterator<String> itr = al.iterator();
		int count = 0;
		while (itr.hasNext()) {
			String name = itr.next();
			if (count % 2 == 0) {
				System.out.println(name);

			}
			count++;
		}

	}
}
