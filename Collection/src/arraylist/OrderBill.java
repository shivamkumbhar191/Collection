package arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Order{
	int id;
	String menuname;
	int qun;
	int price;
	
	public Order(int id, String menuname, int qun, int price) {
		
		this.id = id;
		this.menuname = menuname;
		this.qun = qun;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", menuname=" + menuname + ", qun=" + qun + ", price=" + price + "]";
	}
	
}

public class OrderBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculate total bill for the given menu from order 
		//type of list,order contain id,menu name,quntity,price
		
		//calculate total bill for each menu
		
		ArrayList<Order> al= new ArrayList<>();
		al.add(new Order(110,"Poha",10,30));
		al.add(new Order(115,"Dosa",5,80));
		al.add(new Order(114,"Upama",6,30));
		al.add(new Order(116,"Dosa",9,80));
		al.add(new Order(109,"Idli",20,60));
		al.add(new Order(112,"Poha",5,30));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the menu name");
		String mname=sc.next();
		int totalmenubill=0;
		for(int i=0;i<al.size();i++) {
			if(mname.equalsIgnoreCase(al.get(i).menuname)) {
				totalmenubill=totalmenubill+al.get(i).qun*al.get(i).price;
			}
		}
		System.out.println(totalmenubill);
		
		HashMap<String,Integer> hm= new HashMap<>();
		
		Iterator<Order> itr=al.iterator();
		while(itr.hasNext()) {
			Order o=itr.next();
			int menubill=o.price*o.qun;
			if(hm.containsKey(o.menuname)) {
				int bill=hm.get(o.menuname);
				menubill=menubill+bill;
				hm.put(o.menuname,menubill);
			}
			else {
				hm.put(o.menuname,menubill);
			}
		}
//		Iterator<Order> itr= al.iterator();
//		while(itr.hasNext()) {
//			Order o=itr.next();
//			int total=o.price*o.qun;
//			System.out.println(o.menuname+" "+total);
//			if(hm.containsKey(o.menuname)) {
//				int bill=hm.get(o.menuname);
//				System.out.println(bill);
//				total=total+bill;
//				hm.put(o.menuname, total);
//			}
//			else {
//				hm.put(o.menuname, total);
//			}
//		}
		System.out.println(hm);

		sc.close();
	}

}
