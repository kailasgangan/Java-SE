package datatypes_pro;
class Top{
	public void disp() {
		System.out.println("in top class");
	}
}
class Bottom1 extends Top{
	public void disp() {
		System.out.println("in top bottom1");
	}
}
class Bottom2 extends Top{
	public void disp() {
		System.out.println("in top bottom2");
	}
}
class Bottom3 extends Top{
	public void disp() {
		System.out.println("in top bottom3");
	}
	public void bottom3() {
		System.out.println("another method in bottom3");
	}
}
public class  Demo
{	
	private static void perform(Top ref) {     //upcasting
		ref.disp();
	
	if(ref instanceof Bottom3) {
		Bottom3 b3=(Bottom3)ref;    //downcasting
		b3.bottom3();
	}
	}
	public static void main(String args[])
	{
		 perform(new Bottom1());
		 perform(new Bottom2());
		 perform(new Bottom3());
	}
}

/*
in top bottom1
in top bottom2
in top bottom3
another method in bottom3


*/




































