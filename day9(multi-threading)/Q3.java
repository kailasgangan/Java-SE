public class Mythread implements Runnable
{
	synchronized public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<6;i++)
		{
			System.out.println("Exces"+" "+i);
		}
	}
	public static void main(String args[])
	{
		Mythread th=new Mythread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		Thread t3=new Thread(th);
		t1.setName("First");
		t2.setName("Second");
		t2.setName("Third");
		t1.start();
		t2.start();
		t3.start();
	}
}

/*Thread[First,5,main]
Exces 0
Exces 1
Exces 2
Exces 3
Exces 4
Exces 5
Thread[Thread-2,5,main]
Exces 0
Exces 1
Exces 2
Exces 3
Exces 4
Exces 5
Thread[Third,5,main]
Exces 0
Exces 1
Exces 2
Exces 3
Exces 4
Exces 5
*/
 