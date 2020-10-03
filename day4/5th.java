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
		int i;
		Shape sh[]=new Shape[3];
		sh[0]=new Rectangle();
		sh[1]=new Polygon();
		sh[2]=new Circle();
		for(i=0;i<sh.length;i++) {
			perform(sh[i]);
		}
	}	
}


/*	
draw mthd in class Rectangle
draw mthd in class Polygon
draw mthd in class Circle


*/