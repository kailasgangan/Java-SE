package datatypes_pro;
class Vehicle{
	int num;
	public Vehicle(int k) {
		this.num=k;
		System.out.println("in class Vehicle "+num);
	}
}
class FourWheeler extends Vehicle{
	int num1;
	public FourWheeler(int k) {
		super(200);                                //class fourwheeler set vehicle
		System.out.println("in class fourwheeler");
	}
}
public class  Treewheeler extends Vehicle
{	
	public  Treewheeler(int k) {
		super(100);
		System.out.println("in class Treewheeler");
	}
	
	public static void main(String args[])
	{
		 Treewheeler tree=new Treewheeler(10);
		FourWheeler fw=new FourWheeler(20);
	}
}

/*
in class Vehicle 100
in class Treewheeler
in class Vehicle 200
in class fourwheeler

*/




































