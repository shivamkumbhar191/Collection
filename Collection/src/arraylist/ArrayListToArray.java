package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<>();
		s.add("volvo");
		s.add("nissan GTR");
		s.add("supra");
		s.add("colora");
		s.add("RR Phontom");
		
		System.out.println(s);
		System.out.println("==================");
		
		Object o[]=s.toArray();
		System.out.println(Arrays.toString(o));
		System.out.println("==================");
		
		String str[]= s.toArray(new String[s.size()]);
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("==================");
		String str1[]= new String[s.size()];
		for(int i=0;i<s.size();i++) {
			str1[i]=s.get(i);
			System.out.println(str1[i]);
		}

	}

}
