class shape{
    int width,height;
    public int getnum(){
        return width;
    }
    public int getnum1(){
        return height;
    }
    public void setnum(int a,int b){
        this.width=a;
        this.height=b;
    }
}
public class demo{

     public static void main(String []args){
        System.out.println("Hello World");
        shape sh=new shape();
      sh.setnum(10,20);
       System.out.println(sh.getnum());
      System.out.println(sh.getnum1());
     }
}