public class HelloWorld{
public static void main(String[] args) 
	{
		DemoArr a1[] = new DemoArr[4];
		
		for(int i=0;i<a1.length;i++)
		{
		a1[i]=new DemoArr();
		a1[i].disp();
		}
     }
}
class DemoArr{
    static int count;
    public void disp(){
            System.out.println("no of object"+(++count));
    }
}