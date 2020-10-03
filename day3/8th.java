package datatypes_pro;

class A {
	public void fun() {
		System.out.println("fun with no arg");
	}
}

public class Demo extends A
{
	public void fun(int k) {
		System.out.println("fun with one arg");
	}
	public static void main(String args[])
	{
		Demo dm=new Demo();
		dm.fun();
		dm.fun(12);
	
	}
	
}


/*	
fun with no arg
fun with one arg




*/