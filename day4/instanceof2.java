package devpack;

abstract class annimal{
	 abstract void makeSound();
}
class dog extends annimal{
	 void makeSound() {
		 System.out.println("dog sound");
	 }
}
class cat extends annimal{
	 void makeSound() {
		 System.out.println("cat sound");
	 }
}
class tiger extends annimal{
	 void makeSound() {
		 System.out.println("tiger sound");
	 }
	 void hunting() {
		 System.out.println("tiger hunting");
	 }
}

public class AnimalDemo {
    private static void perform(annimal ref) {
    	if(ref instanceof tiger) {
    		tiger t=(tiger)ref;
    		t.hunting();
    	}
    	ref.makeSound();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new dog());
		perform(new cat());
		perform(new tiger());
	}

}
