public class Mythread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=65;i<91;i++)
		{
			System.out.println((char)i);
		}
	}
	public static void main(String args[])
	{
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		t1.setName("First");
		t2.setName("second");
		t1.start();
		t2.start();
	}
}