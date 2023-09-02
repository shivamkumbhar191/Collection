package arraylistofobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student12 {
	int id;
	String name;
	int marks[];
	float per;

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {

		return Arrays.toString(marks);
	}

}

public class StudentPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student12> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 1; i++) {
			System.out.println("enter the student id");
			int id = sc.nextInt();
			System.out.println("enter the student name");
			String name = sc.next();
			System.out.println("enter the student marks");
			int marks[] = new int[3];
			int sum = 0;
			for (int j = 0; j < marks.length; j++) {
				marks[j] = sc.nextInt();
				sum = sum + marks[j];

			}
			float per = (float) sum / marks.length;
			Student12 st = new Student12();
			st.setId(id);
			st.setName(name);
			st.setMarks(marks);
			st.setPer(per);

			al.add(st);

		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(
					al.get(i).getId() + " " + al.get(i).getName() + " " + al.get(i)+ " " + al.get(i).getPer());
		}
		sc.close();

	}

}
