package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MultiValue2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key obj and value obj");
		for(int i=1;i<=3;i++) {
			System.out.println("enter the car company name");
			String comp=sc.next();
			System.out.println("enter the car names");
			ArrayList<String> al = new ArrayList<>();
			for(int j=1;j<=3;j++) {
				al.add(sc.next());
			}
			hm.put(comp, al);
		}
		System.out.println(hm);
		TreeMap<String, ArrayList<String>> tm= new TreeMap<>(new KeySort1());
		tm.putAll(hm);
		System.out.println(tm);
		sc.close();

	}

}
class KeySort1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
