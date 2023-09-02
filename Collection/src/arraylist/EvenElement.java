package arraylist;

import java.util.ArrayList;

public class EvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(8);
		al.add(1);
		al.add(3);
		al.add(48);
		al.add(49);
		al.add(80);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				System.out.println(al.get(i));
			}
		}

	}

}
