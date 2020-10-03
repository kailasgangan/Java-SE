package test;
import java.util.*;
import java.io.*;
class MyNum implements Serializable
{
	public MyNum(int num) {
		super();
		this.num = num;
	}

	private int num;

	@Override
	public String toString() {
		return "myclass [num=" + num + "]";
	}
}
public class testing
{
	public static void main(String args[])
	{
		MyNum num1=new MyNum(100);
		MyNum num2=new MyNum(200);
		MyNum num3=new MyNum(300);
		MyNum num4=new MyNum(400);
		List<MyNum> lst=new ArrayList<MyNum>();
       lst.add(num1);
       lst.add(num2);
       lst.add(num3);
       lst.add(num4);
		try
		{
		FileOutputStream fos=new FileOutputStream("d:\\my.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
            oos.writeObject(lst);                                       //Serialization
       
		FileInputStream fis=new FileInputStream("d:\\my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<MyNum> lm=(ArrayList<MyNum>)ois.readObject();     //De-Serialization
		
		Iterator itr=lm.iterator();
	while(itr.hasNext()){
		MyNum ref=(MyNum)itr.next();
		System.out.println(ref.toString());
	}
	
		}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
}
}
/*myclass [num=100]
myclass [num=200]
myclass [num=300]
myclass [num=400]
*/