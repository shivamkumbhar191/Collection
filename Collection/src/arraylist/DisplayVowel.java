package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> al = new ArrayList<>();

		al.add('s');
		al.add('h');
		al.add('i');
		al.add('v');
		al.add('a');
		al.add('m');

		ArrayList<Character> vow = new ArrayList<>();
		vow.add('a');
		vow.add('i');
		vow.add('o');
		vow.add('u');
		vow.add('e');
		vow.add('A');
		vow.add('I');
		vow.add('O');
		vow.add('U');
		vow.add('E');

		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < vow.size(); j++) {
				if (al.get(i)==vow.get(j)) {
					System.out.println(al.get(i));
				}
			}
		}
		
		
		Iterator<Character> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
