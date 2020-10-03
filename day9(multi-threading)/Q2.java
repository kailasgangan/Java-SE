public class Mythread implements Runnable
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
		Mythread th=new Mythread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
}