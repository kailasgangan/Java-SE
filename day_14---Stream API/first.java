package core1;

import java.util.ArrayList;
import java.util.List;

enum Type{
	BUY,SELL;
}
class Order{
	public Order(int quantity, double price, Type type) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	private int quantity;
	private double price;
	private Type type;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
public class fg{
	public static long type(List<Order> lst) {  //---------------------count for SELL-------------------------
		return lst.stream().filter((s)->{
			if(s.getType()==Type.SELL) {
				return true;
				}
			return false;
			}).count();	
	}
	public static double price(List<Order> lst) {   //--------------------sum of price-------------------------------
		return   lst.stream().mapToDouble(i->i.getPrice()).sum();
		
	}
	public static int quantity(List<Order> lst) {   //--------------------sum of quantity-------------------------------
		return   lst.stream().mapToInt(i->i.getQuantity()).sum();
		
	}
	public static void main(String args[]) {
		
		List<Order> mylist1=new ArrayList<Order>();
	
		mylist1.add(new Order(100,11000,Type.BUY));
		mylist1.add(new Order(200,12000,Type.BUY));
		mylist1.add(new Order(300,13000,Type.BUY));
		mylist1.add(new Order(400,14000,Type.SELL));
		mylist1.add(new Order(500,15000,Type.SELL));
		
		long t=fg.type(mylist1);
		System.out.println("count for SELL= "+t);
		
		double i=fg.price(mylist1);
		System.out.println("sum of price= "+i);
		
		int l=fg.quantity(mylist1);
		System.out.println("sum of Quantity= "+l);
		
	}
}
/*count for SELL= 2
sum of price= 65000.0
sum of quantity= 1500
*/