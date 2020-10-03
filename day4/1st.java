package datatypes_pro;
class A{
	public A() {
		System.out.println("in class A constructor");
	}
}
class B extends A{
	public B() {
		System.out.println("in class B constructor");
	}
}
class C extends B{
	private int num;
	public C(int k) {
		this.num=k;
		System.out.println("in class C constructor"+num);
	}
}
public class Demo extends C
{
	public Demo(int k) {
		super(k);
	}
	public static void main(String args[])
	{
		Demo dm=new Demo(20);

	}
}

/*in class A constructor
in class B constructor
in class C constructor20
*/




































