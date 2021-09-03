package kr.or.shi.overloading;

class A {
	int data1 = 10;
	int data2 = 20;
}

public class AccumulatorTest {

	public static void main(String[] args) {
		
		Accumulator accum = new Accumulator();
		int iResult = accum.add(10, 50);
		System.out.println("iResult : " + iResult);
		
		long lResult = accum.add(100, 7500L);
		System.out.println("lResult : " + lResult);
		
		double dResult = accum.add(107.88, 11.55);		//double은 오차가 발생함.
		System.out.println("dResult : " + dResult);
		
		long arrResult = accum.add(new int[] {1,2,3,4,5});
		System.out.println("arrResult : " + arrResult);
		
		iResult = accum.add(new A());
		System.out.println("iResult : " + iResult);
	}

}








