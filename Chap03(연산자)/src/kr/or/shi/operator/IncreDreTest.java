package kr.or.shi.operator;

public class IncreDreTest {

	public static void main(String[] args) {
		// 증감연산자
		int x = 10;
		int y = 10;

		System.out.println("--------------------------");
		System.out.println("x = " + (x++)); // 후위 증가 연산자
		System.out.println("x = " + x);
		
		System.out.println("y = " + ++y); // 전위 증가 연산자
		System.out.println("--------------------------");

		System.out.println("(x++) + (++y) = " + (x++ + ++y) );
	}

}
