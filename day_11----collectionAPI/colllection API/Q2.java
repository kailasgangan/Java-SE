package test;
import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class testing
{
	public static void main(String args[])
	{
		Map<Integer,String> lst=new HashMap<Integer,String>();
     lst.put(1001, "kailas");
     lst.put(1002, "prathmesh");
     lst.put(1003, "ajay");
     lst.put(1004, "anil");
     lst.put(1005, "mayur");
     lst.put(1006, "dilip");
     lst.put(1007, "deva");
     lst.put(1008, "neha");
     lst.put(1009, "chetna");
     lst.put(1010, "shubham");
  
		Set<Entry<Integer,String>> s=lst.entrySet();
		Iterator<Entry<Integer,String>> i=s.iterator();
	while(i.hasNext()){
	System.out.println(i.next());
	}
	}
}
