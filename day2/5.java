public class HelloWorld{

     public static void main(String []args){
         a.method1();
         a A=new a();
        A.method();
        System.out.println();
     }
}
class a{
    int num=20;
    static int no=10;
    public void method(){
         System.out.println("after instatiate class non-static method of A \t non-static member="+num);
          System.out.println("non static method can access static data no="+no);
    }
    static void method1(){
         System.out.println("without instatiate class static method of A \t static member="+no);
    }
}
