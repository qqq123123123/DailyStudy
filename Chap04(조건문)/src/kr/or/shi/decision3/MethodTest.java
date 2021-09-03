package kr.or.shi.decision3;

public class MethodTest 
{
	/*
		메소드 선언부 구성
		1. 리턴타입(반환값): int
		2. 메소드 명
		3. (): 매개변수, 인자값, arguments, parameters...
	*/

	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}

	public static int minus(int num1, int num2)
	{
		return num1 - num2;
	}
	public static void main(String[] args) 
	{
		
		int num1 = 10;
		int num2 = 30;

		System.out.println(add(num1, num2));

		// call by value
		int result = add(num1, num2);
		System.out.println(result);

		System.out.println(minus(num1, num2));
	}

}
