public class Hello{
       static emp ref=new emp();
     public static void main(String []args){
        System.out.println(ref.getnum());
     }
}
class emp{
    private static int cnt=10;
    static int getnum(){
        return cnt;
    }
}
//////////////////////////////////////
System.out.println(emp.getnum());