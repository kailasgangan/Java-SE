package datatypes_pro;
interface game{
	void play();
}
class cricket implements game{
	public void play() {
		System.out.println("play method in class cricket");
	}
}
class football implements game{
	public void play() {
		System.out.println("play method in class football");
	}
}
class tennis implements game{
	public void play() {
		System.out.println("play method in class tennis");
	}
}
public class Demo
{
    public static void perform(game ref) {
    	ref.play();
    }	
	public static void main(String args[])
	{
		perform(new cricket());
		perform(new football());
		perform(new tennis());
}
}



/*	
play method in class cricket
play method in class football
play method in class tennis

*/