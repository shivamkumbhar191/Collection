package set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
class  Employee{
	int id;
	String name;
	int salary;
	Department d;
	public Employee(int id, String name, int salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}
	
}
class Department{
	int id;
	String dname;
	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", dname=" + dname + "]";
	}
	
}
public class EmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs= new HashSet<>();
		hs.add(new Employee(11,"jay",50000,new Department(6,"HR")));
		hs.add(new Employee(16,"Adish",35000,new Department(6,"Sales")));
		hs.add(new Employee(13,"Dipak",32000,new Department(6,"Admin")));
		hs.add(new Employee(9,"Sagar",40000,new Department(6,"Sales")));
		hs.add(new Employee(4,"Omkar",60000,new Department(6,"HR")));
		
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		
		HashMap<Department,Integer> hm= new HashMap<>();
		
		ArrayList<String> deplist=new ArrayList<>();
		Iterator<Employee> itr= hs.iterator();
		while(itr.hasNext()) {
			Employee emp=itr.next();
			if(hm.containsKey(emp.d.dname)) {
				//deplist=hm.get(emp.d.dname);
				
			}
		}
		
		
		
		
		
		
		

	}

}
