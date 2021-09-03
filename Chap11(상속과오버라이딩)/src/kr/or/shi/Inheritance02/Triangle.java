package kr.or.shi.Inheritance02;

public class Triangle extends Shape{
	Point[] point;
	
	public Triangle()
	{
		this(new Point(0, 0), new Point(50, 50), new Point(100, 100));
	}

	public Triangle(Point point, Point point2, Point point3)
	{
		System.out.println("Triangle 클래스의 매개변수 3개가 있는 생성자 호출.");
		this.point = new Point[] {point, point2, point3};
	}
	public void draw()
	{
		System.out.println("[point] : x = " + this.point[0].x + ", y =" + this.point[0].y);
		System.out.println("[point] : x = " + this.point[1].x + ", y =" + this.point[1].y);
		System.out.println("[point] : x = " + this.point[2].x + ", y =" + this.point[2].y);
	}
}
