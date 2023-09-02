package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Websites{
	int id;
	String wname;
	String prolangauge;
	public Websites(int id, String wname, String prolangauge) {
		
		this.id = id;
		this.wname = wname;
		this.prolangauge = prolangauge;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", wname=" + wname + ", prolangauge=" + prolangauge + "]";
	}
	
}

public class ProgLangHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Websites> al = new ArrayList<>();
		al.add(new Websites(2, "google", "c++"));
		al.add(new Websites(3, "youtube", "java"));
		al.add(new Websites(9, "amazon", "java"));
		al.add(new Websites(11, "bing", "ruby"));
		al.add(new Websites(6, "twitter", "c++"));
		al.add(new Websites(18, "instagram", "c"));
		
		for(Websites w:al) {
			System.out.println(w);
		}
		HashMap<String,ArrayList<String>> hm= new HashMap<>();
		ArrayList<String> websitelist=new  ArrayList<>();
		Iterator<Websites> itr= al.iterator();
		while(itr.hasNext()) {
			Websites website=itr.next();
			if(hm.containsKey(website.prolangauge)) {
				websitelist=hm.get(website.prolangauge);
				websitelist.add(website.wname);
			}
			else {
				websitelist=new ArrayList<>();
				websitelist.add(website.wname);
			}
			hm.put(website.prolangauge, websitelist);
		}
		System.out.println("-------------------------------------------------------");
		for(Map.Entry<String, ArrayList<String>> me:hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		

	}

}
