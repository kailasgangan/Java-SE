class myclass{
    int num1;
    int num2;
    static int count;
   public myclass(){
       count++;
           System.out.println("no arg constructor");
   }
    public myclass(int a){
            System.out.println("one arg constructor");
        this.num1=a;
        count++;
   }
    public myclass(int a,int b){
            System.out.println("two arg construct");
       this.num1=a;
       this.num2=b;
       count++;
   }
}
public class demo{

     public static void main(String []args){
         myclass m1=new myclass();
           myclass m2=new myclass(10);
             myclass m3=new myclass(12,34);
        System.out.println("no of cunstructor"+myclass.count);
       
     }
}