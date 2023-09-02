package treemap;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMethods {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm= new TreeMap<>(new SortKey());
		tm.put(14, "Pune");
		tm.put(12, "pune");
		tm.put(1, "Mumbai");
		tm.put(2, "Mumbai");
		tm.put(3, "Mumbai");
		tm.put(4, "Mumbai");
		tm.put(15, "nashik");
		tm.put(9, "kolhapur");
		
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(10));	
		System.out.println(tm.ceilingKey(8));
		System.out.println(tm.floorEntry(13));
		System.out.println(tm.floorKey(2));
		System.out.println(tm.lastEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.headMap(9));
		System.out.println(tm.headMap(9, true));
		System.out.println(tm.tailMap(9));
		System.out.println(tm.tailMap(9, false));
		System.out.println(tm.higherEntry(10));
		System.out.println(tm.higherKey(12));
		System.out.println(tm.lowerEntry(3));
		System.out.println(tm.lowerKey(8));
	//	System.out.println(tm.subMap(9, 15));
	//	System.out.println(tm.subMap(9, false, 15, true));
	NavigableMap<Integer,String> np=tm.descendingMap();
	System.out.println(np);
	System.out.println(tm);

	}

}
class SortKey implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
	
}
