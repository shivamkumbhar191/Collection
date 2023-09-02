package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class IntegerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(50);
		hs.add(80);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(40);
		hs1.add(30);
		hs1.add(20);
		hs1.add(70);
		hs1.add(90);
		System.out.println(hs1);
		Scanner sc= new Scanner(System.in);
		Integer input=sc.nextInt();

		if(hs.add(input)==false && hs1.add(input)==false) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present in both set");
		}
		System.out.println(hs1);
		Iterator<Integer> itr=hs.iterator();
		int idx=0;
		while(itr.hasNext()) {
			Integer i=itr.next();
			idx++;
			if(i==input) {
				System.out.println(i+" "+idx);
				
			}
		}
		
		Iterator<Integer> itr1=hs1.iterator();
		int idex=0;
		while(itr1.hasNext()) {
			Integer j=itr1.next();
			idex++;
			if(j==input) {
				System.out.println(j+" "+idex);
			
			}
		}
	}

}
