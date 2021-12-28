package kr.or.shi.string;

public class SubstringTest {

	public static void main(String[] args) {
		String phonenum = "0101234567890";
		String str1 = phonenum.substring(3);
		System.out.println(str1);
		
	
		String str2 = phonenum.substring(0, 3);	//마지막 인덱스는 미포함
		System.out.println(str2);

	}

}
