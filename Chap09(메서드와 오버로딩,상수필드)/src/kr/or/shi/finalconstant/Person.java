package kr.or.shi.finalconstant;

public class Person {

	/*
	 * final 초기화 방법
	 * 1. 선언과 동시에 초기화
	 * 2. 생성자에서 단 한번 초기화
	 */
	final String NATION = "KOREA";				//상수선언
	final int AGE;
	
	public Person(int age) {
		this.AGE = age;
	}
	
//	@Override
//	public String toString() {
//		return "nation = " + this.NATION+
//				", age = " + this.AGE;
//	}
	
	/*
	 * static final ~ :  불변의 정적 상수
	 * 					 무조건 선언과 동시에 초기화가 반드시 되어야함.
	 * 					 공용데이터로써 사용되어짐.
	 * 					 클래스별로 관리되어짐.(인스턴스별  관리 X)
	 * 
	 */
	static final int MAX_NUMBER = 1000;
	
	
}





