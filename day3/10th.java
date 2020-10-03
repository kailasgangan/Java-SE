package datatypes_pro;

interface Vechicle{
	public void start();
}
class TwoWheeler implements Vechicle{
	public void start() {
		System.out.println("start emthod in TwoWheeler ");
	}
}
class TreeWheeler implements Vechicle{
public void start() {
	System.out.println("start emthod in TreeWheeler ");
	}
}
class FourWheeler implements Vechicle{
public void start() {
	System.out.println("start emthod in FourWheeler ");
	}
} 
public class Demo
{
      private static void perform(Vechicle v){
    	  v.start();
      }	
	public static void main(String args[])
	{
       perform(new TwoWheeler());
       perform(new TreeWheeler());
       perform(new FourWheeler());
	}
	
}


/*	
start emthod in TwoWheeler 
start emthod in TreeWheeler 
start emthod in FourWheeler 


*/