package kr.or.shi;

public class VarTest02 {

	public static void main(String[] args) {

		int number; //4바이트 만큼 변수를 메모리(스택)를 할당함
		number = 200;
		System.out.println(number);
		
		int number2 = 500; //선언과 동시에 초기화
		System.out.println(number2);
		
		String str = new String("대구광역시");
		System.out.println(str);
		
		str = null; //null은 '없다'.
		System.out.println(str);
		
		/*
		 * 상수(변하지 않는 값)는 선언과 동시에 초기화를 한 후,
		 * 다시 그 상수값을 변경시키는 코드가 들어가면 안됨.
		 */
		final int MAX_NUMBER = 100;
		//MAX_NUMBER = 200;
		System.out.println("상수: " + MAX_NUMBER);
		

		
	}

}
