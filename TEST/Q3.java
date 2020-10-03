package core1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class OddEven implements Runnable{
	static Class cs;
	public int upto=30;
	static int  n=1;
	int r;

	 
	OddEven(int remainder)
	{
	this.r=remainder;
	}
	 
	@Override
	public void run() {
	while (n < upto) {
	synchronized (this) {
	while (n % 2 != r) { 
	try {
	cs.wait();
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	System.out.println(Thread.currentThread().getName() + " " + n);
	n++;
	cs.notifyAll();
	}
	}
	}
	}

	public class Q3 {
	public static void main(String[] args) {
	 
		 cs=Class.forName("OddEven");
		OddEven odd=new OddEven(1);
		OddEven even=new OddEven(0);
	 
	Thread t1=new Thread(odd,"Odd");
	Thread t2=new Thread(even,"Even");

	t1.start();
	t2.start();
	 
	}
	}