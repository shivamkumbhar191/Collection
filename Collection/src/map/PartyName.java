package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PartyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(123, "bjp");
		hm.put(700, "congress");
		hm.put(980, "bjp");
		hm.put(400, "shivsena");
		hm.put(630, "shivsena");
		hm.put(870, "bjp");
				
		HashMap<String,Integer> hm1= new HashMap<>();

		Iterator<Map.Entry<Integer,String>> itr= hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> me=itr.next();
			int count=0;
			if(hm1.containsKey(me.getValue())) {
				count=hm1.get(me.getValue());
				count++;
			}else {
				count++;
				
			}
			hm1.put(me.getValue(), count);
		}
		System.out.println(hm1);

	}

}
