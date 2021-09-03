package kr.or.shi;

public class VarTest01 
{
	public static void main(String[] args)
	{
		int year = 2021;
		int age = 20;
		/*
		 * sys입력하고 Ctrl + Space를 누르면 자동완성 기능이 실행.(인텔리전스 기능)
		 */
		System.out.println(year);
		System.out.println(year+age);
		
		String str01 = new String();
		str01 = "ㅁㅇㄻㄴㅇㄻㄴㅇㄹ";
		System.out.println(str01);

		/*
		 * 사용자 정의 클래스이거나 toString() 재정의를 하지 않은 클래스의 참조변수는 출력을 하게 되면, 클래스타입@16진수(주소)
		 */
		Object obj01 = new Object();
		System.out.println(obj01);
		System.out.println(obj01.toString());
		
		/*
		 * 리터럴(literal): 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함.
		 * 정수 리터럴은 int로 저장.
		 *  - 정수의 범위가 넘어가는 경우는 L, l 을 써줘야함.
		 *  실수 리터럴은 double로 저장.
		 *  - float으로 사용하려는 경우는 F, f 식별자를 써줘야함.
		 */
		
		
		//아래코드에서 L은 long을 지정하기 위해서 접미사 l, L을 사용.
		long result = 10L;
		System.out.println("long 타입 출력: " + result);
		
		//아래ㅗ드에서 F는 float를 지정하기 위해서 접미사 F,f f를 사용.
		float result2 = 10.1f;
		double dou = 9.999;
		System.out.println(result2 + "  " + dou);
	}
}
