package kr.or.shi.string;

import java.io.UnsupportedEncodingException;

public class GetBytesTest {
	public static void main(String[] args) throws UnsupportedEncodingException{
	
		String str = "안녕하세요";
		
		
		byte[] bytes1 = str.getBytes("UTF-8");
		System.out.println("bytes의 길이: " + bytes1.length);
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("bytes[euc-kr]의 길이: " + bytes2.length);
		
		String str1 = new String(bytes1, "UTF-8");
		System.out.println("UTF-8로 디코딩한 문자열: " + str1);
		
		str1 = new String(bytes2, "euc-kr");
		System.out.println("EUC-KR로 디코딩한 문자열: " + str1);
		
		
	}
}
