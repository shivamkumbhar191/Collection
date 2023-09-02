package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SupplierMap {

	public static void main(String[] args) {
		Map<Integer,String> mp= new HashMap<>();
		mp.put(201, "DSk");
		mp.put(202, "RD");
		mp.put(203, "KD");
		mp.put(204, "Target");
		mp.put(205, "Boat");
		ArrayList<String> al= new ArrayList<>();
		Iterator<Map.Entry<Integer,String>> itr =mp.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> me=itr.next();
			al.add(me.getValue());
		}
		System.out.println(al);
	}

}
