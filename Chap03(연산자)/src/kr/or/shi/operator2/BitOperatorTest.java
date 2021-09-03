package kr.or.shi.operator2;

public class BitOperatorTest {

	public static void main(String[] args) {
		
		// &, |, ^ 3개를 비트 연산자라고 함

		int x = 8;
		int y = 5;

		System.out.println("x를 2진수로 변환한 결과: " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환한 결과: " + Integer.toBinaryString(y));

		System.out.println("x, y를 비트 &(AND) 연산 결과: " + (x & y));
		System.out.println("x, y를 비트 |(OR) 연산 결과: " + (x | y));

		// XOR(배타적논리합): 서로 다를 때 1을 줌.
		System.out.println("x, y를 배타적논리합 ^(XOR) 연산 결과: " + (x ^ y));

		//----------------------------------------
		int x2 = -8;
		int y2 = -5;

		System.out.println("x를 2진수로 변환한 결과: " + Integer.toBinaryString(x2));
		System.out.println("y를 2진수로 변환한 결과: " + Integer.toBinaryString(y2));

		System.out.println("x, y를 비트 &(AND) 연산 결과: " + (x2 & y2));
		System.out.println("x, y를 비트 |(OR) 연산 결과: " + (x2 | y2));

		// XOR(배타적논리합): 서로 다를 때 1을 줌.
		System.out.println("x, y를 배타적논리합 ^(XOR) 연산 결과: " + (x2 ^ y2));

	}

}
