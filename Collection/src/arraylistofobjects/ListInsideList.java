package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

class Menu1{
	int mid;
	String mname;
	ArrayList<MenuItems1> items;
	public Menu1(int mid, String mname, ArrayList<MenuItems1> items) {
		this.mid = mid;
		this.mname = mname;
		this.items = items;
	}
	@Override
	public String toString() {
		return "[mid=" + mid + ", mname=" + mname + ", items=" + items + "]";
	}
	
}
class MenuItems1{
	int itemid;
	String itemname;
	int itemprice;
	public MenuItems1(int itemid, String itemname, int itemprice) {
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	@Override
	public String toString() {
		return "[" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	}
	
}
public class ListInsideList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu1> mn=new ArrayList<>();
		Scanner sc= new Scanner (System.in);
		
		for(int i=1;i<=2;i++) {
			System.out.println("enter the menu id");
			int mid=sc.nextInt();
			System.out.println("enter the menu name");
			String mname=sc.next();
			ArrayList<MenuItems1> itemlist= new ArrayList<>();
			for(int j=1;j<=2;j++) {
				System.out.println("enter the item id");
				int id=sc.nextInt();
				System.out.println("enter the item name");
				String name=sc.next();
				System.out.println("enter the item price");
				int price=sc.nextInt();
				itemlist.add(new MenuItems1(id,name,price));
			}
			mn.add(new Menu1(mid,mname,itemlist));
			
		}
		for(Menu1 menu:mn) {
			System.out.println(menu);
		}
		sc.close();
	}

}
