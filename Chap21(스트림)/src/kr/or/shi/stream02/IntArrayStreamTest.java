package kr.or.shi.stream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		Arrays.stream(arr).forEach(n->System.out.println(n + "\t"));
		System.out.println();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(sum2);
		
	}

}
