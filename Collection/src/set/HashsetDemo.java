package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(11);
		hs.add(45);
		hs.add(7);
		hs.add(20);
		hs.add(72);
		hs.add(7);
		
		System.out.println(hs);
		
		TreeSet<Integer>tm= new TreeSet<>(new Intsort());
		tm.addAll(hs);
	
		System.out.println(tm);
	}

}
class Intsort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2;
	}
	
}
