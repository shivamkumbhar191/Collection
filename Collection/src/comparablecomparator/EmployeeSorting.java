package comparablecomparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	int id;
	String empname;
	int salary;
	String depname;
	public Employee(int id, String empname, int salary, String depname) {
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", empname=" + empname + ", salary=" + salary + ", depname=" + depname + "]";
	}
}

public class EmployeeSorting {

	public static void main(String[] args) {
		LinkedList<Employee> ll= new LinkedList<>();
		
		ll.add(new Employee(101,"aayush",20000,"HR"));
		ll.add(new Employee(102,"rohan",30000,"Support"));
		ll.add(new Employee(109,"aayush",50000,"Devlopment"));
		ll.add(new Employee(105,"kunal",50000,"Testing"));
		
		for(Employee e:ll) {
			System.out.println(e);
		}
		Collections.sort(ll,new SalarySort());
		System.out.println("===================================================");
		Iterator<Employee> itr1=ll.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Collections.sort(ll,new NameSort());
		System.out.println("===================================================");
		Iterator<Employee> itr2=ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		Collections.sort(ll,new DepartnameSort());
		System.out.println("===================================================");
		for(Employee e1:ll) {
			System.out.println(e1);
		}

	}

}
class SalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.salary-o2.salary;
	}
}
class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empname.compareTo(o2.empname);
	}
}
class DepartnameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.depname.compareTo(o1.depname);
	}
}