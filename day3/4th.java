package datatypes_pro;


public class Demo extends Check
{
	private String name;
	public Demo(String a,int k) {
		super(k);
		this.name=a;
		System.out.println("in demo class constructor "+name);
	}
	public static void main(String args[]){
	      Demo dm=new Demo("kailas",12);
	}
	
}
class Check{
	private int num;
	public Check(int k){	
		this.num=k;
		System.out.println("in Check class constructor "+num);
	}
	
		
	}
/*	
in Check class constructor 12
in demo class constructor kailas
*/