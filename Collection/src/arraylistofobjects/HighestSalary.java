package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

class Employe {
	int id;
	String name;
	int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class HighestSalary {
	public static void main(String[] args) {
		ArrayList<Employe> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("enter the Employee id");
			int id = sc.nextInt();
			System.out.println("enter the Employee name");
			String name = sc.next();
			System.out.println("enter the Employee salary");
			int salary = sc.nextInt();

			Employe emp = new Employe();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);

			al.add(emp);
		}

		int maxsal = al.get(0).salary;
		for (int i=0;i<al.size();i++) {
			if (maxsal<=al.get(i).salary) {
				maxsal=al.get(i).salary;
			}
		}
		System.out.println("maximun salary is "+maxsal);

		for(int i=0;i<al.size();i++){
			if(maxsal==al.get(i).salary){
				System.out.println(al.get(i).getId()+" "+al.get(i).getName()+" "+al.get(i).getSalary());
			}
		}
		sc.close();
		
//if only one employee has max salary	
//		for (int i = 0; i < al.size(); i++) {
//			for (int j = i + 1; j < al.size(); j++) {
//				if (al.get(i).salary < al.get(j).salary) {
//					int temp = al.get(i).salary;
//					al.get(i).salary = al.get(j).salary;
//					al.get(j).salary = temp;
//				}
//			}
//		}
//		System.out.println(al.get(0).id + " " + al.get(0).name + " " + al.get(0).salary);

	}
}
