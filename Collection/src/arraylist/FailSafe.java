package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(48);
		al.add(72);
		al.add(91);
		al.add(94);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next()==48) {  //fail safe``	
			itr.remove();
		}
		}
		System.out.println(al);

	}

}
