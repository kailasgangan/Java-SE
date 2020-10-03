package test;
import java.util.*;
import java.io.*;

interface game{
	public void play();
	
}
class cricket implements game{
	public void play() {
		System.out.println("class cricket");
	}
}
class football implements game{
	public void play() {
		System.out.println("class football");
	}
}
class tennis implements game{
	public void play() {
		System.out.println("class tennis");
	}
}
class common<A extends game>{
	A ref;
	public common(A ref) {
		this.ref=ref;
	}
	void perform() {
		ref.play();
	}
}
public class generic{
	
	public static void main(String args[]) {
		common<cricket> c1=new common<cricket>(new cricket());
		c1.perform();
		
		common<football> c2=new common<football>(new football());
		c2.perform();
		
		common<tennis> c3=new common<tennis>(new tennis());
		c3.perform();
	}
}