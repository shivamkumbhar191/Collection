package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Student1{
	int id;
	String name;
	int marks;
	
	public Student1(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
class Result{
	int sid;
	int totalmarks;
	public Result(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "[sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	@Override
	public int hashCode() {
		return sid;
	}
	@Override
	public boolean equals(Object obj) {
		Result r=(Result)obj;
		return  this.sid==r.sid;
	}
	
}
public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> al= new ArrayList<>();
		al.add(new Student1(101,"shivam",60));
		al.add(new Student1(131,"ajay",74));
		al.add(new Student1(161,"uday",70));
		al.add(new Student1(131,"ajay",84));
		al.add(new Student1(101,"shivam",80));
		al.add(new Student1(131,"ajay",59));
		HashSet<Result> hs= new HashSet<>();
		for(int i=0;i<al.size();i++) {
			int total =0;
			for(int j=0;j<al.size();j++) {
			if(al.get(i).id==al.get(j).id) {
				total =total +al.get(j).marks;
				}		
			}
			hs.add(new Result(al.get(i).id,total));
		}
		
		System.out.println(hs);
		
		

	}

}
