package kr.or.shi.method;

/*
 * 반환값이 있고 받는 인자값은 없는 메소드 구현
 * 
 */

public class Method03 {

	public static int returnMethod()
	{
		int result = 100;
		result *= 10;
		return result;
	}
	public static void main(String[] args) {
		int result = returnMethod();
		System.out.println(result);
	}

}
