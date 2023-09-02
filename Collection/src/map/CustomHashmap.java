package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Student implements Comparable<Student>{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[" + id + "," + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return o.id-this.id;
	}
	
}

public class CustomHashmap {

	public static void main(String[] args) {
		HashMap<Student,String> hp=new HashMap<>();
		hp.put(new Student(101,"dipesh"), "php");
		hp.put(new Student(109,"kunal"), "golang");
		hp.put(new Student(119,"sudarshan"), "ruby");
		hp.put(new Student(104,"omkar"),"swift");
		hp.put(new Student(117,"adish"), "javascript");
		
		TreeMap<Student,String> tm=new TreeMap<>(hp);
		
		System.out.println(tm);
		
		TreeMap<Student,String> tm1= new TreeMap<>(new NameSort());
		tm1.putAll(hp);
		System.out.println(tm1);
			
	}

}
class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}
