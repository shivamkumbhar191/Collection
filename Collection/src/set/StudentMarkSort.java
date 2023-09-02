package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Student2{
	int id;
	String name;
	int marks;
	public Student2(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class StudentMarkSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student2> hs= new HashSet<>();
		hs.add(new Student2(101,"shivam",89));
		hs.add(new Student2(103,"uday",87));
		hs.add(new Student2(109,"prajwal",78));
		hs.add(new Student2(106,"rohan",80));
		hs.add(new Student2(107,"kunal",93));
		
		List<Student2> lt=new ArrayList<>();
		lt.addAll(hs);
		Collections.sort(lt,new MarkSort());
		System.out.println(lt);
	}
}
class MarkSort implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o2.marks-o1.marks;
	}
	
}
