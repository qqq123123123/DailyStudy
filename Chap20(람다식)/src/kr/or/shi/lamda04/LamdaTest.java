package kr.or.shi.lamda04;

public class LamdaTest {

	public static void main(String[] args) {
		MyInterface myInterface = null;
		
		myInterface = (x, y) -> { 
			int result = x + y;
			return result;
		};
		int result = myInterface.method(100, 200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식의 값: " + result);
		
		myInterface = (x, y) -> x + y;
		result = myInterface.method(987, 81894);
		System.out.println("result: " + result);
		
		myInterface = (x, y) -> add(x, y);
		result = myInterface.method(112,123);
		System.out.println("result : " + result);
	}
	
	public static int add(int x, int y)
	{
		return x + y;
	}

}
