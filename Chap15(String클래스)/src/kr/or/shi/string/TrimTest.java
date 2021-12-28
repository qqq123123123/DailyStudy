package kr.or.shi.string;

public class TrimTest {

	public static void main(String[] args) {

		String tel1 = "            01";
		String tel2 = "=1243          ";
		String tel3 = "   -6789       ";
		
		System.out.println(tel1.trim());
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
	}

}
