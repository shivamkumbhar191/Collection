package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
	int mid;
	String mname;
	Items it;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Items getIt() {
		return it;
	}

	public void setIt(Items it) {
		this.it = it;
	}
}

class Items {
	int itid;
	String itname;
	int itprice;

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

public class MenuItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details");
		for (int i = 1; i <=2; i++) {
			System.out.println("enter the menu id");
			int mid = sc.nextInt();
			System.out.println("enter the menu name");
			String mname = sc.next();
			System.out.println("enter the menu item id");
			int itemid = sc.nextInt();
			System.out.println("enter the menu item name");
			String itemname = sc.next();
			System.out.println("enter the menu item price");
			int itemprice = sc.nextInt();
			Menu m = new Menu();
			m.setMid(mid);
			m.setMname(mname);
			m.setIt(new Items());
			m.getIt().setItid(itemid);
			m.getIt().setItname(itemname);
			m.getIt().setItprice(itemprice);

			al.add(m);

		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getIt().getItprice() >= 100) {
				System.out.println(al.get(i).getMid() + " " + al.get(i).getMname() + " " + al.get(i).getIt().getItid()
						+ " " + al.get(i).getIt().getItname() + " " + al.get(i).getIt().getItprice());
			}
		}
		sc.close();

	}

}
