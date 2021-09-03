package kr.or.shi.operator3;

public class StringEqualsTest {

	public static void main(String[] args) 
	{
		// 참조형 타입의 ==, !=에 대해서 알아보자

		/*
			리터럴인 경우에는 같은 값이 있는지 체크한다.
			먼저 메모리공간(heap)을 확인하고 나서 같은 값이 있다면 해당 주소를 공유하게 되고, 없다면 새로운 곳에 인스턴스를 생성해준다.
		*/
		String str1 = "대구광역시";
		// String str2 = "자바";
		String str2 = "대구광역시";

		//	참조형 타입에서
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);

		//	new 연산자를 사용해서 객체 생성 시 새로운 인스턴스가 생성됨.
		String str3 = new String("대구광역시");
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);

		/*
			String 클래스의 equals()는 주소가 아닌 값으로 비교.
		*/
		
		result = str1.equals(str2);
		System.out.println("str1.equals(str2) : " + result);

		result = str1.equals(str3);
		System.out.println("str1 = str3 ? : " + result);

				
	}

}
