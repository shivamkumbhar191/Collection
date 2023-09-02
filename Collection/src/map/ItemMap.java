package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Item{
	int id;
	String name;
	int price;
	Supplier s;
	public Item(int id, String name, int price, Supplier s) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", s=" + s + "]";
	}
	
}
class Supplier{
	int sid;
	String sname;
	public Supplier(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
public class ItemMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> l=new ArrayList<>();
		Map<Integer,String> mp= new HashMap<>();
		l.add(new Item(101,"Iphone14",150000,new Supplier(201,"RK Market")));
		l.add(new Item(102,"Earphone",200,new Supplier(202,"Channel 5")));
		l.add(new Item(103,"Sceengard",100,new Supplier(203,"Rd")));
		l.add(new Item(104,"Charger",1500,new Supplier(201,"RK Market")));
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			if(l.get(i).price>100) {
				mp.put(l.get(i).s.sid, l.get(i).s.sname);
			}
		}
		System.out.println("--------------------------");
		for(Map.Entry<Integer,String> m:mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("--------------------------");
		System.out.println(mp);
		

	}

}
