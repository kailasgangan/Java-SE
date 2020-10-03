public class Hello{
       
     public static void main(String []args){
       demo dm=new demo();
       demo dm1=dm;
        dm.disp();10
       dm1.disp();10
       
       dm1=new demo();creating new instance 
       dm1.cnt=100;
       dm.disp();10
       dm1.disp();100
     }
}
class demo{
    int cnt=10;
   public void disp(){
 System.out.println(cnt);  
    }
}