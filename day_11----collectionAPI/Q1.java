package test;
import java.util.*;
import java.io.*;
class myclass implements Serializable
{
	public int getNum() {
		return num;
	}
	int num;
	myclass(int num)
	{
		this.num=num;
	}
}
public class Demo
{
	public static void main(String args[])
	{
		myclass m1=new myclass(100);
		myclass m2=new myclass(200);
		myclass m3=new myclass(300);
		myclass m4=new myclass(400);
		
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
       
		FileInputStream fis=new FileInputStream("d:\\\\my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<myclass> lm=(ArrayList<myclass>)ois.readObject();     //De-Serialization
		
		Iterator itr=lm.iterator();
	while(itr.hasNext()){
		myclass ref=(myclass)itr.next();
		System.out.println(ref.getNum());
	}
	
		}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
}
}
