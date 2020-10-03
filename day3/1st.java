class First{
    int num;
    First(int n){
        this.num=n;
    }
    public void method(){
         System.out.println("in method class first  "+num);
    }
    
}
class Second{
    String name;
    Second(String n){
        this.name=n;
    }
    public void method(){
         System.out.println("in method class second  "+name);
    }
    
}
public class Two{

     public static void main(String []args){
        System.out.println("Hello World");
        First f=new First(100);
        Second s=new Second("kailas");
        f.method();
        s.method();
        
     }
}