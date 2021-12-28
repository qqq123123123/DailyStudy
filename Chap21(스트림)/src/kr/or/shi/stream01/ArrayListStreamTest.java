package kr.or.shi.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		
		sList.add("Welcome");
		sList.add("to");
		sList.add("SCT");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		
		sList.stream().forEach(s -> System.out.print(s + "\t"));
		
		//	정렬해서 각각 출력함.	정렬이 기존 자료인 sList를 변화시키진 않음.
		sList.stream().sorted().forEach(s -> System.out.println(s + "\t"));
		
		//	Stream의 length를 가져와서 하나씩 length를 출력함.
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n + "\t"));
		System.out.println("");
		
		
		//	갖고 있는 스트림에서 length가 5보다 큰 것을 출력하라.
		sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
	}

}
