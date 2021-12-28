package kr.or.shi.string;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		System.out.println("대문자로 바꾸기 = " + str1.toUpperCase());
		System.out.println("소문자로 바꾸기 = " + str1.toLowerCase());
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));	//	대소문자를 구별하지 않고 비교를 하고자 한다면 equalsIgnoreCase() 사용
	}

}
