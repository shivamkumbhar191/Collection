package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(101, "Jay");
		hm.put(102, "Ajay");
		hm.put(109, "uday");
		hm.put(116, "rohan");
		hm.put(112, "aayush");
		System.out.println(hm);
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		System.out.println(tm);
		NavigableMap<Integer, String> nm=tm.descendingMap();
		System.out.println("using navigablemap");
		System.out.println(nm);
		TreeMap<Integer,String> tm1=new TreeMap<>(new KeySort());
		tm1.putAll(hm);
		System.out.println("using comparator");
		System.out.println(tm1);
	
	}

}
class KeySort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}