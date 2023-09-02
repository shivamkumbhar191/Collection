package arraylist;

import java.util.ArrayList;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(72);
		al.add(12);
		al.add(50);
		al.add(67);
		al.add(80);
		int sum=0;
		for(int i=0;i<al.size();i++ ) {
			sum=sum+al.get(i);
		}
		System.out.println(sum);

	}

}
