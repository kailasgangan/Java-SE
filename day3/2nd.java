class First{
    static int num;
    First(int n){
        this.num=n;
    }
    public static void method(int k){
        num=k;
         System.out.println("static method class first  "+num);
    }
    public void nonstat(){
      System.out.println("in non static method");   
    }
    
}
class Second{
    static String name;
    Second(String n){
        this.name=n;
    }
    public static void method(){
         System.out.println("in static method class second  "+name);
    }
    
}
public class Two{

     public static void main(String []args){
        First.method(100);
        First f=new First(10);
        Second s=new Second("kailas");
        f.nonstat();
        s.method();
    
     }
}