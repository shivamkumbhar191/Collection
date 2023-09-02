package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("pune");
		l.add("Mumbai");
		l.add("Chennai");
		l.add("pune");
		l.add("pune");
		l.add("Mumbai");
		l.add("Delhi");
		l.add("Banglore");
		l.add(" ");
		System.out.println(l);
		Map<String,Integer> mp= new HashMap<>();
		
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals("\0")) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i).equals(l.get(j))) {
					count++;
					l.set(j,"\0");
				}
			}
			mp.put(l.get(i), count);
		}
		System.out.println("---------------------------------------");

		for(Map.Entry<String,Integer> me:mp.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
