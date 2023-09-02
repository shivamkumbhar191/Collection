package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
class Employee1 implements Comparable<Employee1>{
	int eid; 
	String ename;
	int salary;
	Department1 d;
	public Employee1(int eid, String ename, int salary, Department1 d) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.d = d;
		
	}
	@Override
	public String toString() {
		return "[eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", " + d + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		if(this.d.dname==o.d.dname) {
			return this.salary-o.salary;
		}else {
			return o.d.dname.compareTo(this.d.dname);
		}
	}
}
class Department1{
	int did;
	String dname;
	public Department1(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
		
	}
	@Override
	public String toString() {
		return "[did=" + did + ", dname=" + dname + "]";
	}
}

public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee1,String> mp=new HashMap<>();
		mp.put(new Employee1(101, "Uday", 15000, new Department1(201, "HR")), "Pune");
		mp.put(new Employee1(102, "Dipesh", 45000, new Department1(202, "Admin")), "Mumbai");
		mp.put(new Employee1(103, "Aayush", 25000, new Department1(203, "Sales")), "Banglore");
		mp.put(new Employee1(104, "Adish", 50000, new Department1(204, "Developer")), "Pune");
		mp.put(new Employee1(105, "Nitish", 25000, new Department1(202, "Admin")), "Hydrabad");
		System.out.println("Before sorting");
		for(Map.Entry<Employee1, String> me:mp.entrySet()) {
			System.out.println(me.getKey()+" city= "+me.getValue());
		}
		System.out.println("After sorting");
		TreeMap<Employee1,String> tm= new TreeMap<>();
		tm.putAll(mp);
		for(Employee1 e:tm.keySet()) {
			System.out.println(e+" city= "+tm.get(e));
		}
		
		
	}

}
