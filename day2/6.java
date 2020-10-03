class P
{
    int num;
	static
	{
		System.out.println("Inside class P static");
	}
	{
	    System.out.println("Inside class P non-static block");
	}
	public P(){
	    this.num=100;
	    System.out.println("class p constructor"+this.num);
	}

}

public class MyClass2 {

	public static void main(String[] args) 
	{
	     System.out.println("order of execution\n");
		P ob1 = new P();
	
	}

}