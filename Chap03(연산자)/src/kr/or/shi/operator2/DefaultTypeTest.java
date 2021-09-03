package kr.or.shi.operator2;

public class DefaultTypeTest {

	public static void main(String[] args) {

		byte b1 = 127;
		byte b2 = 1;
		//byte b3 = b1 + b2; //	byte + byte -> int + int -> int

		//해결책1: int형으로 변경
		int i1 = b1 + b2;

		//해결책2: 강제 캐스팅

		byte b3 = (byte)(b1 + b2);

		System.out.println(i1);

		System.out.println(b3);

		//--------------------------------------------

		char ch = 'A'; // A는 아스키코드 값으로 65이다.
		int i2 = ch + b2;
		System.out.println(i2);

		//----------------------------------------------
		float f1 = 15.5f;
		// 정수형 + 실수형 => 표현범위가 더 넓은 쪽으로 형 변환(캐스팅)이 되어 연산이 이루어진다.
		// int i3 = b1 + f1;	// float + float = float
		float f2 = b1 + f1;

		System.out.println(f2);

		//-------------------------------------------
		double d1 = 10.5;
		// float f3 = d1 + f1; // float + double = double
		double d2 = f1 + d1;
		System.out.println(d2);
	}

}
