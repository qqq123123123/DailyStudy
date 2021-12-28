package kr.or.shi.lamda02;

public class MyInterfaceTest {

	public static void main(String[] args) {
		
		/*
		 * 	람다식 이용해서 익명구현객체 생성
		 * 	매개변수 없을 때, () 생략 불가.
		 * 	{}는 추상메소드인 method()의 구현부가 들어가야 하며, 2줄이기 때문에 {} 생략불가.
		 */
		
		MyInterface myInterface = () -> {
			String str = "람다식으로 만든 익명구현 객체";
			System.out.println(str);
		};
		myInterface.method();
		
		//익명구현객체
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public void method() {
				String str = "직접 만든 익명구현 객체";
				System.out.println(str);
				
			}
		};
		
		myInterface2.method();
		
		
		myInterface = () -> {System.out.println("람다식으로 만든 익명구현 객체2");};
		myInterface.method();
		
		myInterface = () -> System.out.println("람다식으로 만든 익명구현 객체임222");
		myInterface.method();
	}

}
