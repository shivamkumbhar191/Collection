package treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>(new JersyNosort());
		tm.put(101, "Virat");
		tm.put(107, "MS");
		tm.put(109, "Rohit");
		tm.put(104, "Sky");
		tm.put(116, "Sir");
		
		System.out.println(tm);
		System.out.println("=============================================");

	}

}
class JersyNosort implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
