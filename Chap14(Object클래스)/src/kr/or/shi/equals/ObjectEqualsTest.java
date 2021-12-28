package kr.or.shi.equals;

public class ObjectEqualsTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean result1 = obj1.equals(obj2);
		System.out.println("equals(): "  + result1 );

		boolean result2 = (obj1 == obj2);
		System.out.println("==연산자: " + result2);
	}

}
