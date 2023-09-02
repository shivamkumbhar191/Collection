package arraylistofobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Students {
	int id;
	String name;
	Marks m;
	double per;

	public Students(int id, String name, Marks m,double per) {
		this.id = id;
		this.name = name;
		this.m = m;
		this.per=per;

	}

	public String toString() {
		return id + " " + name + " " + m+" "+per;
	}

}
class Marks {
	int mrks[];

	public Marks(int mrks[]) {
		this.mrks = mrks;
	}

	public String toString() {
		return Arrays.toString(mrks);
	}
}

public class Student {

	public static void main(String[] args) {
		
		ArrayList<Students> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("enter student id");
			int id = sc.nextInt();
			System.out.println("enter student name");
			String name=sc.next();
		
			int m[]=new int[3];
			System.out.println("enter student marks");
			int sum=0;
			for (int j = 0; j < 3; j++) {
				m[j]=sc.nextInt();
				sum=sum+m[j];
			}
			double per=((float)sum/(m.length*100))*100;
			Students s = new Students(id, name,new Marks(m),per);
			st.add(s);
		}
		
		for(int i=0;i<st.size();i++) {
			if(st.get(i).per>60) {
				System.out.println(st.get(i));
			}
		}
		sc.close();

	}

}
