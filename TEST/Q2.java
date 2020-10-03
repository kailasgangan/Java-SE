
import java.util.*;
import java.util.Map.Entry;
public class Q2
{
public static void main(String args[])
{
Map <String,String> m1=new HashMap<String,String>();

m1.put("dil bechara","sushant");
m1.put("kabirsing","shahid kapoor");
m1.put("iron man","tony ");
m1.put("airlift","akshay kumar");
                        
Set<Entry<String,String>> set=m1.entrySet();

Iterator<Entry<String, String>> itr=set.iterator();

while(itr.hasNext())
{
Map.Entry<String,String> get=(Entry<String, String>)itr.next();
System.out.print(get.getKey()+ ":");
System.out.println(get.getValue());
}
     }
}
