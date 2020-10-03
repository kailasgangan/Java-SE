package datatypes_pro;

class A {
	private int num;
	public A(int k){
		this.num=k;
		System.out.println("in class A constructor ");
	}
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("in class A"+num);
	}
}
class B extends A{
	private int num1;
	public B(int k){
		super(k);
		this.num1=k;
		System.out.println("in class B constructor ");
	}
}
public class Demo extends A
{
	private String name;
	public Demo(String a,int k) {
		super(k);
		this.name=a;
		System.out.println("in demo class constructor ");
	}
	public static void main(String args[])
	{
	      Demo dm=new Demo("kailas",12);
	      B b=new B(13);
	      dm.disp();
	      b.disp();
	}
	
}


/*	
in class A constructor 
in demo class constructor 
in class A constructor 
in class B constructor 
in class A12
in class A13


*/