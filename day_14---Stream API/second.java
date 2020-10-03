package core1;

import java.util.ArrayList;
import java.util.List;

class Student{
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private int rollno;
	private String name;
	private int age;
	private int marks;
	public Student(int rollno, String name, int age, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}
public class fg{
	public static long startwiths(List<Student> lst) {
		return lst.stream().filter(i->i.getName().startsWith("a")).count();
	}
	public static long morethan70(List<Student> lst) {
		return lst.stream().filter(i->i.getMarks() >70).count();
	}
	public static long between22and25(List<Student> lst){
		return lst.stream().filter(i->
		{
			if(i.getAge()<25) {
				if(i.getAge()>=22) {
					return true;
				}
			}
			return false;
		}).count();
	}
	public static void main(String args[] ) {
	List<Student> lst=new ArrayList<Student>();
	lst.add(new Student(1,"kailas",22,70));
	lst.add(new Student(2,"joshua",22,60));
	lst.add(new Student(3,"deva",26,90));
	lst.add(new Student(4,"akash",23,80));
	lst.add(new Student(5,"anil",26,50));
	
	long l=fg.startwiths(lst);
	System.out.println("find out name starts with 'a'= "+l);
	
	long l1=fg.morethan70(lst);
	System.out.println(" how many students got more than 70= "+l1);
	
	long l2=fg.between22and25(lst);
	System.out.println("how many students in between age 22 and 25= "+l2);
	
	}
}
/*find out name starts with 's'2
 how many students got more than 70= 2
how many students in between age 22 and 25= 3
*/