package datatypes_pro;
class C{
	private int num2;
	public C(int c){	
		this.num2=c;
		System.out.println("in class C constructor "+num2);
	}
}
class B extends C{
	private int num1;
	public B(int b,int c){
		super(c);
		this.num1=b;
		System.out.println("in class B constructor "+num1);
	}
}
class A extends B{
	private int num;
	public A(int a,int b,int c){
		super(b,c);
		this.num=a;
		System.out.println("in class A constructor "+num);
	}
}	
public class Demo extends A
{

	private String name;
	public Demo(String k,int a,int b,int c) {
		super(a,b,c);
		this.name=k;
		System.out.println("in demo class constructor "+name);
	}
	public static void main(String args[])
	{
	      Demo dm=new Demo("kailas",13,12,11);
	}
	
}


/*	
in class C constructor 11
in class B constructor 12
in class A constructor 13
in demo class constructor kailas

*/