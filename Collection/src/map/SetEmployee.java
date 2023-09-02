package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Employee{
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
	int did;
	String dname;
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "[did=" + did + ", dname=" + dname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, dname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return did == other.did && Objects.equals(dname, other.dname);
	}
	
}
public class SetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs= new HashSet<>();
		hs.add(new Employee(101, "ajay", 15000, new Department(201, "HR")));
		hs.add(new Employee(106, "uday", 25000, new Department(208, "finance")));
		hs.add(new Employee(103, "adish", 18000, new Department(203, "sales")));
		hs.add(new Employee(104, "suraj", 13000, new Department(201, "HR")));
		hs.add(new Employee(109, "jay", 22000, new Department(203, "sales")));
		
		HashMap<Department,Integer> hm= new HashMap<>();
		Iterator<Employee> itr=hs.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			int totalsal=e.salary;
			int count=1;
			if(hm.containsKey(e.d)) {
				count++;
				int sal=hm.get(e.d);
				totalsal=(totalsal+sal)/count;
				hm.put(e.d, totalsal);
			}
			else {
				hm.put(e.d, totalsal);
			}
		}
		System.out.println(hm);
	

	}

}
