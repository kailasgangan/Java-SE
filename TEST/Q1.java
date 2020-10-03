package core1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product implements Serializable{
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	public Product(int id, String name, int price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	private int id;
	private String name;
	private int price;
	private int qty;
}
public class Q1{
	

	public static void main(String args[]) {
		
		List<Product> lst=new ArrayList<Product>();
		
		lst.add(new Product(1,"samsung",12000,10));
		lst.add(new Product(2,"nokia",10000,20));
		lst.add(new Product(3,"redmi",14000,30));
		lst.add(new Product(4,"oneplus",22000,15));
		
		try(FileOutputStream fos=new FileOutputStream("D:\\a.txt"))
		{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
		oos.writeObject(lst);
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

		try(FileInputStream fis=new FileInputStream("D:\\a.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			List temp=(ArrayList)ois.readObject();
			Iterator itr=temp.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				Product pdct=(Product)itr.next();
				pdct.toString();
			}
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}