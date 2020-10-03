package datatypes_pro;
class base{
	int s;
	public base(int s) {
		System.out.println("in class base "+s);
	}
}
class sub extends base{
	public sub() {
		super(12);
		System.out.println("no arg constructor");
	}
	public sub(int k) {
		super(k);
		System.out.println("one arg constructor");
	}
	public sub(int k,int g) {
		super(g);
		System.out.println("two arg constructor");
	}
}
public class Demo
{
	
	public static void main(String args[])
	{
		sub h=new sub(90);
      sub s=new sub();
      sub g=new sub(11,22);
}
}



/*	
in class base 90
one arg constructor
in class base 12
no arg constructor
in class base 22
two arg constructor

*/