package kr.or.shi2;

public class Review {

	/*
	 	1. main() 메소드가 없다면 기본 메소드를 찾을 수 없다라고 에러 발생.
	 	>자바 프로그램이 실행되면 제일 먼저 메인 메소드를 찾아서 실행.
	 	--> entry point
		
		2. 자바 NamingConvension
			- 낙타등 표기법(Camel back notation) 
				: 이름이 여러 단어로 이루어져 있는 경우 두 번째 단어부터 첫 글자는 대문자로 표기.
			- 뱀 표기법 (snake notation)
				: 모든 글자를 대문자로 적어주고 이름이 여러 단어일 때 단어 사이마다 _를 넣어서 단어 구별을 쉽게 할 수 있게 적는 표기법.
			
			
			- 클래스: 대문자로 시작하고 낙타등 표기법을 사용하는 명사임.
			- 상수: 모든 글자를 대문자로 표기하고 뱀 표기법을 사용하여 작성.
			- 메소드: 소문자로 시작하고 낙타등 표기법을 사용.
			- 변수: 소문자로 시작하고 낙타등 표기법을 사용.
	 */
	public static void main(String[] args) {
		
		/*
			연산자 혹은 메소드의 결과로 사용하는 것이 대부분임.
			어떤 조건식이 참일 때 실행 혹은 반복문이 되는 제어문에서 값에 따라서 실행 혹은 반복이 됨.
		*/
		boolean boo = true;
		System.out.println(boo);

		boo = false;
		System.out.println(boo);

		//	printf() --> 지시자를 사용
		//	%d (정수), %f (실수), %c (문자), %s (문자열), %b (부울), %n (줄바꿈), %o(8진수), %x(16진수)

		System.out.printf("나는 %.2f살의 대학생이다. 학점: %c", 25.50, 'A');
	}

}
