package kr.or.shi.boxing;

import java.util.*;


public class AutoBoxingUnBoxingTest {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		List list = new Vector();
		list.add(obj1);
		list.add(obj2);
		list.add(50);
		System.out.println(list);
		
		int value1 = (Integer)list.get(0);
		System.out.println(value1);
		
		int value2 = obj2.intValue();
		System.out.println(value2);
		
		int value3 = obj2;
		System.out.println(value3);
		
		//	객체 + 기본타입은 문법에러지만 wrapper 클래스이기에 컴파일러가 자동 언박싱해서 연산이 가능함.
		int result = obj1 + 500;
		System.out.println(result);
		
		
	}

}
