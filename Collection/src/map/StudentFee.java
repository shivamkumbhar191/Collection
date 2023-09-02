package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

class Student11 implements Comparable<Student11>{
	int id;
	String name;
	public Student11(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[" + id + "," + name + "]";
	}
	@Override
	public int compareTo(Student11 o) {
		
		return this.id-o.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student11 other = (Student11) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

	
}
class Course{
	int cid;
	String cname;
	int fees;
	public Course(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "[" + cid + "," + cname + "," + fees + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, fees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(cname, other.cname) && fees == other.fees;
	}

		
}

public class StudentFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student11,Course> hs=new HashMap<>();
		hs.put(new Student11(101,"uday"), new Course(201,"python",27000));
		hs.put(new Student11(102,"jay"), new Course(209,"java",18000));
		hs.put(new Student11(106,"ajay"), new Course(211,"php",25000));
		hs.put(new Student11(103,"aman"), new Course(204,"js",20000));
		hs.put(new Student11(101,"uday"), new Course(201,"python",35000));
		System.out.println(hs);
		TreeMap<Student11,Course> tm= new TreeMap<>();
		tm.putAll(hs);
		System.out.println(tm);
		NavigableMap<Student11,Course> nm=tm.descendingMap();
		System.out.println(nm);
	}

}
class FeeSort implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return o2.fees-o1.fees;
	}
}
