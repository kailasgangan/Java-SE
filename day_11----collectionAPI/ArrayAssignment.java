package test;
import java.util.*;
import java.io.*;
class myclass implements Serializable
{
	private int empid;
	private String name,desig;
	private double salary;
	public myclass(int empid, String name, String desig, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "myclass [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
}
public class testing
{
	public static void main(String args[])
	{
		myclass m1=new myclass(1,"kailas","m1",50000);
		myclass m2=new myclass(2,"prathmesh","m2",60000);
		myclass m3=new myclass(3,"Akshay","m3",70000);
		myclass m4=new myclass(4,"Anil","m4",80000);
		
		List<myclass> lst=new ArrayList<myclass>();
        lst.add(m1);
        lst.add(m2);
        lst.add(m3);
        lst.add(m4);
		try
		{
		FileOutputStream fos=new FileOutputStream("d:\\my.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
       oos.writeObject(lst);                                       //Serialization
       
		FileInputStream fis=new FileInputStream("d:\\my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<myclass> lm=(ArrayList<myclass>)ois.readObject();     //De-Serialization
		
		Iterator itr=lm.iterator();
	while(itr.hasNext()){
		myclass ref=(myclass)itr.next();
		System.out.println(ref.toString());
	}
	
		}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
}
}
