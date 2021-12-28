package kr.or.shi.stream01;

import java.util.Arrays;

/*
 * 	스트림(Stream)
 * 		1)	자료의 대상과 상관없이 동일한 연산을 수행할 수 있는 기능(자료의 추상화)
 * 		2)	배열, 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 기능
 * 		3)	한 번 생성하고 사용한 스트림은 재사용할 수 없음.
 * 		4)	스트림 연산은 기존 자료를 변경하지 않음.
 * 		5)	중간 연산은 최종 연산으로 구분 됨.
 * 		6)	최종 연산이 수행되어야 모든 연산이 적용되는 지연 연산
 */

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr)
		{
			System.out.println(num);
		}
		
		System.out.println();
		
		//	IntStream
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		
	}

}
