package datatypes_pro;

class A {
	private int num=12;
	public void disp() {             //overriding
		
		System.out.println("in class A"+num);
	}
}

public class Demo extends A
{
	public void disp() {           //overridden
		
		System.out.println("in class Demo");
	}
	public void method() {
		System.out.println("in method");
	}
	public static void main(String args[])
	{
		A dm=new Demo();   //upcasting
		dm.disp();       
		// dm.method();   //
		Demo a=(Demo)dm;   //downcasting
		a.disp(); 
		a.method();   //using parent class referance invoking child class method using downcasting
	}
	
}


/*	
in class Demo
in class Demo
in method



*/