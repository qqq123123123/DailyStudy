package kr.or.shi.method;

/*
	메소드란 무엇인가?
		-	함수, function, 어떤 특정한 동작이나 처리를 하도록 만들어진 코드단위임.
		-	재사용
		-	호출 시 어떤 결과를 반환하기도 하고 결과를 반환하지 않는 메소드 있음.
		-	호출 시 어떤 인자 값들을 넘겨서 호출하는 경우도 있고, 인자 값 없이 호출하는 경우도 있음.

	메소드 종류(크게 4가지 유형)
		(1)	반환값 X	받는 인자값 X
		(2)	반환값 X	받는 인자값 O
		(3)	반환값 O	받는 인자값 X
		(4)	반환값 O	받는 인자값 O
*/

public class Method01 {

	public static void helloWorld()
	{
		System.out.println("Hello World!");
	}

	public static void showMenu()
	{
		System.out.println("showmenu 호출");
	}

	public static void main(String[] args) {
		helloWorld();
		showMenu();
	}

}
