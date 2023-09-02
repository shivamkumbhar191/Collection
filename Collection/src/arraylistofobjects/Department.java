package arraylistofobjects;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
}

public class Department {
	
	int did;
	String dname;
	Employee emp;
	Department(int did,String dname,Employee emp){
		this.did=did;
		this.dname=dname;
		this.emp=emp;
	}
	public String toString() {
		return did+" "+dname+" "+emp;
	}

	public static void main(String[] args) {
		ArrayList<Department> dt= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enter the department id");
			int did=sc.nextInt();
			System.out.println("enter the department name");
			String dname=sc.next();
			System.out.println("enter the employee id");
			int id=sc.nextInt();
			System.out.println("enter the employee name");
			String name=sc.next();
			System.out.println("enter the employee salary");
			int salary=sc.nextInt();
			
			dt.add(new Department(did,dname,new Employee(id,name,salary)));
		}
		System.out.println(dt);
		sc.close();

	}

}
