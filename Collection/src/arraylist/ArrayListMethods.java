package arraylist;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> car = new ArrayList<>();
		
		car.add("Bmw");
		car.add("prado");
		car.add("superbb");
		
		System.out.println(car);
		System.out.println(car.size());
		
		System.out.println(car.set(1,"volvo"));
		
		System.out.println(car.isEmpty());
		
		System.out.println(car.get(1));
		
		car.remove(2);
		
		System.out.println(car);
		
		ArrayList<String> colour=new ArrayList<>();
		
		colour.add("black");
		colour.add("white");
		
		colour.add("red");
		
		
		car.addAll(1,colour);
		System.out.println(car);
		
		car.remove("red");
		
		car.remove(2);
		
		System.out.println(car);
		
		
		
		
		

	}

}
