package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

class Supplier {
	private int sid;
	private String sname;
	private Item it;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Item getIt() {
		return it;
	}

	public void setIt(Item it) {
		this.it = it;
	}
}

class Item {
	private int itid;
	private String itname;
	private int itprice;

	public int getItid() {
		return itid;
	}

	public void setItid(int itid) {
		this.itid = itid;
	}

	public String getItname() {
		return itname;
	}

	public void setItname(String itname) {
		this.itname = itname;
	}

	public int getItprice() {
		return itprice;
	}

	public void setItprice(int itprice) {
		this.itprice = itprice;
	}

}

public class SupplierContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Supplier> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("enter the supplier id");
			int sid = sc.nextInt();
			System.out.println("enter the supplier name");
			String sname = sc.next();
			System.out.println("enter the supplier item id");
			int itemid = sc.nextInt();
			System.out.println("enter the supplier item name");
			String itemname = sc.next();
			System.out.println("enter the supplier item price");
			int price = sc.nextInt();
			Supplier sp = new Supplier();
			sp.setSid(sid);
			sp.setSname(sname);
			sp.setIt(new Item());
			sp.getIt().setItid(itemid);
			sp.getIt().setItname(itemname);
			sp.getIt().setItprice(price);

			al.add(sp);
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getIt().getItprice() >= 1000) {
				System.out.println(al.get(i).getSid() + " " + al.get(i).getSname() + " " + al.get(i).getIt().getItid()
						+ " " + al.get(i).getIt().getItname() + " " + al.get(i).getIt().getItprice());
			}
		}
		sc.close();

	}

}
