package kr.or.shi.generic04;

/*
 * 	1.	제네릭 메소드
 * 		1)	제네릭 클래스가 아니더라도 내부에 제네릭 메소드를 구현하여 사용할 수 있음.
 * 		2)	public 반환형 메소드이름(자료형 매개변수) {} 
 * 
 * 	2.	두 점을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메소드를 작성해보자.
 * 		두 점은 정수인 경우도, 실수인 경우도 있으므로 제네릭 타입을 사용하여 구현한다.
 */


public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> point1, Point<T, V> point2)
	{
		double left = ((Number)point1.getX()).doubleValue();
		double right = ((Number)point2.getY()).doubleValue();
		double top = ((Number)point1.getX()).doubleValue();
		double bottom = ((Number)point2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height; 
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(10, 0.0);
		Point<Integer, Double> p2 = new Point<>(100, 10.0);
		
		double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println(size);
	}
	
}
