package kr.or.shi.classs;

import java.lang.reflect.Constructor;

/*
 * 	1. Class 클래스
 * 		1)	자바의 모든 클래스와 인터페이스는 컴파일 후 class파일로 생성됨.
 * 		2)	.class 파일에는 객체의 정보 (멤버변수, 메소드, 생성자 등)가 포함되어 있음.
 * 		3)	Class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음.
 * 
 * 	2. Class 클래스 가져오기
 * 		1)	String s = new String();
 * 			Class c = s.getClass();
 * 		2)	Class c = String.Class();
 * 		3)	Class c = Class.forName("java.lang.String");	//	동적 로딩
 * 
 */


public class StringTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		Constructor[] constructors = c.getConstructors();
		for(Constructor constructor : constructors)
		{
			System.out.println(constructor);
		}
	}
}
