package kr.or.shi.lamda03;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface = null;
		myInterface = (x) -> {
			int result = x * 10;
			System.out.println("매개변수 x값을 가지고 람다식을 구현한 메소드의 값: " + result);
		};
		
		myInterface.method(500);
		
		myInterface = x -> {System.out.println("result: " + x * 10);};
		myInterface.method(50);
		
	}

}
