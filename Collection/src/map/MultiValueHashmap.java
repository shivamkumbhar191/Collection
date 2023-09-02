package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultiValueHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> hm= new HashMap<>();
		
//		al.add("pune");
//		al.add("nashik");
//		al.add("kolhapur");
//		hm.put("Maharashtra",al);
//		System.out.println(hm);
		
		System.out.println("enter key and value");
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enter the key");
			String state=sc.next();
			System.out.println("enter the value");
			ArrayList<String> al= new ArrayList<>();
			for(int j=1;j<=2;j++) {
				String city=sc.next();
				al.add(city);
			}
			hm.put(state, al);
		}
		for(Map.Entry<String, ArrayList<String>> me:hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		sc.close();

	}

}
