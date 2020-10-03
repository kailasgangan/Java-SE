package test;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Demo{
	public static void main(String args[]) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1,"sachin");
		m1.put(2,"dohni");
		m1.put(3,"virat");
		m1.put(4, "sharma");
		m1.put(5,"jadeja");
		Scanner sc=new Scanner(System.in);
		int str=sc.nextInt();
		System.out.println(m1.get(str));
		
	}
}
