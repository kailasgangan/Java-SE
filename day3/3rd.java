package datatypes_pro;


public class CheckDemo
{
	public static void main(String args[]){
		Check ch=new Check(10,"kailas","gangan");
		//System.out.println(ch.num);  //private can't access outside class
		System.out.println(ch.name);   //can access anywhere
		System.out.println(ch.sname);    //can access in within package and outside package but in sub class
		ch.disp();   //to access private num
	}
	
}
class Check{
	private int num;
	public String name;
	protected String sname;
	public Check(int k,String s,String n){
		this.num=k;
		this.name=s;
		this.sname=n;
	}
	public void disp() {
		System.out.println(num);   //private can access only in class
		
		
	}
	
}
