package datatypes_pro;
class Vehicle{
	public void start() {
		System.out.println("in class vehicle method");
	}
}
class FourWheeler extends Vehicle{
	public void start() {
		System.out.println("in class FourWheeler method");
	}
	public void method() {
		System.out.println("in method");
	}
}
public class Demo 
{
	
	public static void main(String args[])
	{
		FourWheeler f=new FourWheeler();
		f.start();
		f.method();
		Vehicle g=new FourWheeler();    //upcasting
		g.start();
	//	g.method;
		FourWheeler fw=(FourWheeler)g;    //downcasting
		fw.start();
		fw.method();
	}
}

/*in class FourWheeler method
in method
in class FourWheeler method
in class FourWheeler method
in method
*/




































