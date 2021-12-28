package kr.or.shi.boxing;

public class BoxingUnBoxingTest {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100;				//	박싱	->	객체화 시킴
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4.intValue();	//	언박싱 -> 기본값으로 바뀜
	}
}
