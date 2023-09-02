package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"bmw","prado","gmc","camry"};
		ArrayList<String> al= new ArrayList<>(Arrays.asList(s));  //method1
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<>();  //method2
		for(int i=0;i<s.length;i++) {
			al2.add(s[i]);
		}
		System.out.println(al2);
		
		ArrayList<String> al3=new ArrayList<>(); //method3
		Collections.addAll(al3,s);
		System.out.println(al3);
		
		Integer i[]= {1,9,6,7,6,4};
		ArrayList<Integer> n=new ArrayList<>(Arrays.asList(i));
		System.out.println(n);
		
		ArrayList<Integer> al4= new ArrayList<>();
		Collections.addAll(al4, i);
		System.out.println(al4);
		
		ArrayList<Integer> al5 = new ArrayList<>();
		for(int k=0;k<i.length;k++) {
			al5.add(i[k]);
		}
		System.out.println(al5);
	
		

	}

}
