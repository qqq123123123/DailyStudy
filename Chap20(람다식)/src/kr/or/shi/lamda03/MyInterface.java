package kr.or.shi.lamda03;

@FunctionalInterface
public interface MyInterface {
	void method(int x);	//	매개변수 있음.
	//	void method2(int x);	//	추상 메소드가 2개 이상이면 컴파일 에러 발생
}
