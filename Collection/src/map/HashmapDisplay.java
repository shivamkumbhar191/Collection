package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDisplay {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hp=new HashMap<>();
		hp.put(11, "CanGreen");
		hp.put(18, "virat");
		hp.put(64, "BenStoaks");
		hp.put(41, "Archer");
		hp.put(16, "Smith");
		
		System.out.println(hp);
		System.out.println("=================================");
		for(Map.Entry<Integer, String> m:hp.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("=================================");
		Set s=hp.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me=itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
			
		}
		System.out.println("=================================");
		Set s1=hp.keySet();
		Iterator<Integer> it=s1.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i+" "+hp.get(i));
		}
		System.out.println("=================================");
		for (Integer key : hp.keySet()) {
	           System.out.println("Key: " + key + ", Value: " + hp.get(key));
	    }

	}

}
