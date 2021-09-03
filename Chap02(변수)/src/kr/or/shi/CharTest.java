package kr.or.shi;

public class CharTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		
		
		/*
		 * character set: 문자를 숫자로 변환한 값의 세트
		 * ASCII code: 알파벳과 숫자, 특수 문자 등을 1바이트에 표현하는데 사용하는 문자세트
		 * UNICODE: 전 세계 표준으로 만든 문자 세트
		 * 	- UTF-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음.
		 * 	- UTF-16: 2바이트로 문자를 표현
		 * 	- 한글 유니코드 표
		 */
		
		//문자도 정수로 변환함.
		//어떤 문자를 컴퓨터 내부에서 표현하기 위해서 특정 정수 값을 정의.
		//A는 65 (인코딩 encoding: 문자가 숫자로 변환되는 것)
		System.out.println((int)ch1);
		

		int ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2); //decoding: 숫자에서 문자로 변환되는 것.
		
		char ch3 = '한';
		char ch4 = '\uD55C';
		System.out.println(ch3);
		System.out.println(ch4);

	}

}
