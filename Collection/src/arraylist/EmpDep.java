package arraylist;

import java.util.ArrayList;

class Employee2{
	int id;
	String name;
	Department d;
	public Employee2(int id, String name,Department d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "[" + id + "," + name + "," + d + "]";
	}

	
}
class Department{
	String dep;

	public Department(String dep) {
		super();
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Department [" + dep + "]";
	}
	
}

public class EmpDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//delete all emp who are working in same department like emp id 10
		ArrayList<Employee2> al= new ArrayList<>();
		al.add(new Employee2(101,"Uday",new Department("HR")));
		al.add(new Employee2(104,"Omkar",new Department("Sales")));
		al.add(new Employee2(109,"Rohan",new Department("Admin")));
		al.add(new Employee2(102,"Akshay",new Department("HR")));
		al.add(new Employee2(114,"Ajay",new Department("Sales")));
		String depname="";
		for(int i=0;i<al.size();i++) {
			if(al.get(i).id==101) {
				depname=al.get(i).d.dep;
			}
			if(depname==al.get(i).d.dep) {
				al.remove(al.get(i));
			}
		}
		System.out.println(al);
	
		

	}

}
