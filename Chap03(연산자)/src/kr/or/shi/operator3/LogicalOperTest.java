package kr.or.shi.operator3;

public class LogicalOperTest {

	public static void main(String[] args) 
	{
		//	논리연산자 (&&, ||)

		boolean result = false;
		int i = 10;
		char ch = 'b';

		result = (i > 5);
		System.out.println("(i > 5) : " + result);

		result = (i >= 9) && (i < -8);
		System.out.println("i >= 9 and i < -8 = " + result);

		result = (i >= 9) || (i < -8);
		System.out.println("i >= 9 or i < -8 = " + result);

		//	알파벳 소문자인지 확인하는 식
		result = (ch > 'a' && ch <= 'z');
		System.out.println("(ch > 'a' && ch <= 'z') = " + result);

		//	ch에 저장된 값이 알파벳인지 확인하는 조건
		//	알파벳 : true

		result = (ch > 'a' && ch <= 'z') || (ch > 'A' && ch < 'Z');
		System.out.println("알파벳 : " + result);

		//	범위를 비교할 때에는 값 <= 변수 <= 값 식으로 쓸 수 없다.
		//	왼쪽에서 오른쪽으로 실행이 됨.
	}

}
