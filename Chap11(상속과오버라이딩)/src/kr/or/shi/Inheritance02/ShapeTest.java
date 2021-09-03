package kr.or.shi.Inheritance02;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();

		Circle circle2 = new Circle(new Point(100,50),50);
		circle2.draw();

		Triangle triangle = new Triangle();
		triangle.draw();
	}

}
