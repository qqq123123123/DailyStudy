package kr.or.shi.Inheritance02;

public class Circle extends Shape
{
    Point center;
    int radius;

    public Circle()
    {
        this(new Point(0, 0), 100);
    }
    public Circle(Point center, int radius)
    {
        System.out.println("Circle 클래스의 매개변수");
        this.center = center;
        this.radius = radius;
    }
    public void draw()
    {
        System.out.println("색깔 : " + this.color);
        System.out.println("Center: x = " + this.center.x + ", y = " + this.center.y);
        System.out.println("radius: " + this.radius);
    }
}
