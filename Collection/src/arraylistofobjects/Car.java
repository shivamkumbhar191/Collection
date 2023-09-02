package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

	private int modelno;
	private String cname;
	private int price;
	private String colour;

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cr= new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enetr the car modelno");
			int nmo=sc.nextInt();
			System.out.println("enetr the car name");
			String cname=sc.next();
			System.out.println("enetr the car price");
			int price = sc.nextInt();
			System.out.println("enetr the car colour");
			String colour=sc.next();
			Car c=new Car();
			c.setCname(cname);
			c.setModelno(nmo);
			c.setPrice(price);
			c.setColour(colour);
			cr.add(c);	
		}
		for (int i=0;i<cr.size();i++) {
			if(cr.get(i).colour.equals("red")) {
				System.out.println(cr.get(i).getCname()+" "+cr.get(i).getModelno()+" "+cr.get(i).getPrice()+" "+cr.get(i).getColour());
			}
		}
		sc.close();

	}

}
