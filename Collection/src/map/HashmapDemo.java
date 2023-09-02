package map;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println(hm.put(10, "pune"));

		hm.put(20, "Mumbai");
		String s = hm.put(10, "Goa");
		System.out.println(s);

		String s1=hm.put(20, "MP");
		System.out.println("s1= "+s1);

		System.out.println(hm);

	}

}
