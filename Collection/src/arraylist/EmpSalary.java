package arraylist;

import java.util.ArrayList;

class Employee1{
	int id;
	String name;
	int salary;
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[" + id + ", " + name + ", salary=" + salary + "]";
	}
	
}

public class EmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al = new ArrayList<>();
		al.add(new Employee1(101,"Uday",40000));
		al.add(new Employee1(104,"Omkar",12000));
		al.add(new Employee1(109,"Rohan",35000));
		al.add(new Employee1(102,"Akshay",18000));
		al.add(new Employee1(114,"Ajay",16000));
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i).salary<20000) {
				al.get(i).salary=al.get(i).salary+(al.get(i).salary/10);
				System.out.println(al.get(i).salary+" "+al.get(i).name+" "+al.get(i).id);
			}
			
		}
		for(Employee1 e:al) {
		System.out.println(e);
		}
	}

}
