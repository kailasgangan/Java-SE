public class ClassLock2 implements Runnable
{
	static Class cls;
	 static void disp1()
	 {
		synchronized(cls)
		{
		for(int i=1;i<=10;i++)
		{
System.out.println(i);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
		}
		}
		}
		System.out.println("outside block");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public void run()
	{
		disp1();
	}
	public static void main(String args[])throws Exception
	{
		 cls=Class.forName("ClassLock2");
	    ClassLock2 c=new ClassLock2();
		ClassLock2 c1=new ClassLock2();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}