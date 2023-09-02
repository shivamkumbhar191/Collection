package arraylist;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(17);
		al.add(23);
		al.add(80);
		
		for(int i=0;i<al.size();i++) {
			boolean prime=true;
			for(int j=2;j<al.get(i);j++) {
				if(al.get(i)%j==0) {
					prime=false;
				}
			}
			if(prime==true) {
				System.out.println(al.get(i));
			}
		}

	}

}
