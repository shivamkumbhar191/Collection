package arraylist;

import java.util.ArrayList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(6);
		al.add(8);
		al.add(48);
		al.add(72);
		al.add(80);
		Integer temp;
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) < al.get(j)) {
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);

				}
			}

		}
		System.out.println(al);
	}

}
