package kr.or.shi.overloading;

public class Accumulator {

	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}
	
//	public int add (int a, int b) {
//		return a + b;
//	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
	
	//참조형 변수를 받아서 오버로딩 적용
	public long add(int[] arr) {
		System.out.println("add(int[] arr)");
		
		long sum = 0L;
		for(int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	//클래스를 매개변수로 받아서 오버로딩하는 경우
	public int add(A a) {
		System.out.println("add(A a)");
		return a.data1 + a.data2;
	}
}













