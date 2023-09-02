package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return o.marks-this.marks;
	}
	
}

public class StudentSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs= new HashSet<>();
		hs.add(new Student(101,"Mangesh",89));
		hs.add(new Student(114,"Nitesh",91));
		hs.add(new Student(116,"Nikhil",65));
		hs.add(new Student(109,"Ajay",72));
		hs.add(new Student(103,"Uday",80));

		TreeSet<Student>tm=new TreeSet<>(hs);
		System.out.println(tm);
		ArrayList<Student> al= new ArrayList<>(tm);
		for(Student s:al) {
			System.out.println(s);
		}
		

	}

}
