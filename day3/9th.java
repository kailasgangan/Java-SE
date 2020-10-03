package datatypes_pro;

class Shape {
	public void draw() {
		System.out.println("draw mthd in class shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("draw mthd in class Circle");
	}
}
class Polygon extends Shape{
	public void draw() {
		System.out.println("draw mthd in class Polygon");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("draw mthd in class Rectangle");
	}
}
public class Demo
{
	public static void perform(Shape ref) {
		ref.draw();
	}
	public static void main(String args[])
	{
		perform(new Circle());
		perform(new Polygon());
		perform(new Rectangle());
	}
	
}


/*	
draw mthd in class Circle
draw mthd in class Polygon
draw mthd in class Rectangle

*/