package devpack;

abstract class course{
    public abstract void start();
    public abstract void end();
}
class mscit extends course{
  public void start(){
        System.out.println("start mscit");
    }
   public void end(){
        System.out.println("end mscit");
    }
    
}
class basic extends course{
    public void start(){
        System.out.println("start basic");
    }
    public void end(){
        System.out.println("end basic");
    }
}
class dbda extends course{
   public  void start(){
        System.out.println("start dbda");
    }
    public void end(){
        System.out.println("end dbda");
    }   
    void orientation(){
        System.out.println("orientation method");
    }
}
public class CourseDemo{
    public void perform(course ref){
        if(ref instanceof dbda){
            dbda db=(dbda)ref;
            db.start();
            db.end();
            db.orientation();
        }
        ref.start();
        ref.end();
    }
     public static void main(String []args){
    	 CourseDemo cd=new CourseDemo();
        cd.perform(new mscit());
        cd.perform(new basic());
        cd.perform(new dbda());
     }
}