package datatypes_pro;
interface Parent1{
	void disp1();
}
class Parent2 {
	int num=100;
	public void disp2() {
		System.out.println("in disp2 method class Parent2");
	}
	public void fun() {
		System.out.println("in method fun class Parent2");
	}
} 
public class Demo extends Parent2 implements Parent1
{
	public void disp1() {
		System.out.println("in disp1 method of interface class demo");
	}
	public static void main(String args[])
	{
       Demo dm=new Demo();
       dm.disp1();
       dm.disp2();
       dm.fun();
       System.out.println(dm.num);
}
}



/*	
in disp1 method of interface class demo
in disp2 method class Parent2
in method fun class Parent2
100

*/