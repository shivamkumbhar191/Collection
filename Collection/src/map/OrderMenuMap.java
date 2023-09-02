package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Menu {
	int mid;
	String mname;
	int price;

	public Menu(int mid, String mname, int price) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", price=" + price + "]";
	}

}
class Order {
	int oid;
	int menuid;
	int qun;

	public Order(int oid, int menuid, int qun) {
		super();
		this.oid = oid;
		this.menuid = menuid;
		this.qun = qun;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menuid=" + menuid + ", qun=" + qun + "]";
	}

}
public class OrderMenuMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> mn = new ArrayList<>();
		mn.add(new Menu(1, "Tea", 10));
		mn.add(new Menu(2, "Samosa", 20));
		mn.add(new Menu(3, "Upama", 30));
		mn.add(new Menu(4, "Poha", 25));

		ArrayList<Order> or = new ArrayList<>();
		or.add(new Order(101, 3, 4));
		or.add(new Order(114, 4, 1));
		or.add(new Order(148, 3, 5));
		or.add(new Order(103, 1, 9));
		or.add(new Order(112, 1, 6));
		or.add(new Order(110, 2, 2));
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < mn.size(); i++) {
			int bill = 0;	
			for (int j = 0; j < or.size(); j++) {
				if (or.get(j).menuid == mn.get(i).mid) {
					bill = bill + mn.get(i).price * or.get(j).qun;
				}	
			}
			hm.put(mn.get(i).mname, bill);
		}
		System.out.println(hm);
	
	}

}
