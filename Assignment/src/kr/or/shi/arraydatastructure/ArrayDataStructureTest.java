package kr.or.shi.arraydatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
	자료구조 = 데이터 구조
		-	대량의 데이터를 효율적으로 관리할 수 있는 데이터의 구조를 의미.
		-	코드를 효율적으로 데이터를 처리하기 위해, 데이터를 특성에 따라, 체계적으로 데이터를 구조화해야함.

	대표적인 자료구조
	-	배열
	-	스택, 큐, 연결 리스트, 해쉬 테이블, 힙 등

	*배열(Array)	:	꼭 알아둬야 할 자료 구조
		-	데이터를 나열하고, 각 데이터를 인덱스에 대응하도록 구성한 데이터 구조
		-	같은 종류의 데이터를 효율적으로 관리하기 위해 사용
		-	같은 종류의 데이터를 순차적으로 저장
		-	장점: 빠른 접근 가능(인덱스 번호로 접근)
		-	단점: 데이터 추가/삭제의 어려움.

	*Primitive 자료형 vs Wrapper 클래스 
		-	int와 Integer

	
*/

public class ArrayDataStructureTest {

	public static void main(String[] args) {
		Integer[] dataList = new Integer[10];
		dataList[0] = 10;
		System.out.println(Arrays.toString(dataList));

		Integer[] dataList2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(dataList2));

		//	배열보다 손쉽게 다루기 위한 클래스 제공
		//	ArrayList: 가변 길이의 배열 자료구조를 다룰 수 있는 기능 제공
		List<Integer> list1 = new ArrayList<>();	//	int형 데이터를 담을 수 있는 가변 길이 배열 선언
		list1.add(100);								//	배열에 아이템을 추가시 add(아이템) 메소드 사용.
		list1.add(200);
		int value = list1.get(0);					//	배열의 특정 아이템을 읽을 시 get(인덱스번호) 메소드 사용
		System.out.println(value);

		list1.set(0, 300);							//	특정 인덱스에 해당하는 아이템 변경 시 set(index 번호, 변경할 값) 메소드 사용
		value = list1.get(0);					
		System.out.println(value);

		list1.remove(0);
		System.out.println(list1.toString());

		list1.size();
		System.out.println(System.identityHashCode(list1));

		list1 = new LinkedList<>();
		System.out.println();

		System.out.println(System.identityHashCode(list1));
	}

}
