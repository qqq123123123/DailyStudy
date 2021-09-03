package kr.or.shi.staticmethod;

public class Calculator {
	
	//	인스턴스 메소드
	//	인스턴스 메소드 특징:	new 연산자로 인스턴스를 생성하고 참조변수명.인스턴스 메소드명 접근 가능.
	public int add(int a, int b)
	{
		double dResult = Calculator.divide(10.5, 11.7);
		System.out.println("인스턴스 메소드 내에서 static 메소드 호출" + dResult);
		return a + b;
	}
	public int substract(int a, int b)
	{
		return a - b;
	}
	//	정적(static) 메소드
	//	static 메소드 특징:	인스턴스 생성없이 클래스명.정적메소드명으로 바로 접근 가능.
	public static double divide(double a, double b)
	{
		/*
			static 메소드는 이미 메모리 상단에 올라가 있고 인스턴스 생성없이 접근이 가능해야 하는데,
			인스턴스가 생성되어야지만 사용가능한 add()가 왔기 때문에 예외가 발생한것임.

			즉, 인스턴스가 언제 생성될지 아무도 모르기 때문에 static 메소드 안에는 인스턴스 메소드가 절대로 오면 안된다.
		*/
		return a / b;
	}
	public static long mul(long a, long b)
	{
		return a * b;
	}


}
