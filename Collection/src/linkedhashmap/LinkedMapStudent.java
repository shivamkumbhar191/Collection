package linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Student{
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
	public int hashCode() {
		return id;
	}
	public boolean equals(Object o) {
		Student s=(Student)o;
		if(this.id==s.id && this.name==s.name) {
			return true;
		}
		else {
			return false;
		}
	}

}

public class LinkedMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Student, String> lm=new LinkedHashMap<>();
		lm.put(new Student(103,"Ajay"), "Devops");
		lm.put(new Student(102,"uday"), "Javascript");
		lm.put(new Student(105,"ankit"), "Ruby");
		lm.put(new Student(106,"Shantanu"), "Angular");
		lm.put(new Student(105,"zenith"), "Golang");
		lm.put(new Student(102,"uday"), "python");
		
		System.out.println(lm);
		System.out.println("==========================================");
		Set s=lm.entrySet();
		Iterator<Map.Entry<Student, String>> itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Student, String> me=itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
