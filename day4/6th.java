package datatypes_pro;
interface A{
	void disp1();
}
interface B extends A{
	void disp2();
}
class C implements B{
	int num=100;
	public void disp1() {
		System.out.println("in disp1 method");
	}
	public void disp2() {
		System.out.println("in disp2 method");
	}
	public void fun() {
		System.out.println("in method fun");
	}
} 
public class Demo
{
	static {
		System.out.println("static");
	}
	{
		System.out.println("non static");
	}
	public Demo() {
		System.out.println("in constructor");
	}
	
	public static void main(String args[])
	{
//		Demo dm=new Demo();          
		C c=new C();
		c.disp1();
		c.disp2();
		c.fun();
		System.out.println(c.num);
		}
}	



/*	
??????????without instantiate class
static
in disp1 method
in disp2 method
in method fun
100

??????????with instantiate class
static
non static
in constructor
in disp1 method
in disp2 method
in method fun
100

*/