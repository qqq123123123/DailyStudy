package kr.or.shi.operator3;

public class AccuracyTest {

	public static void main(String[] args) {
		//	CPU연산의 오차를 확인
		int apple = 1;
		double unit = 0.1;
		int number = 7;

		double result = apple - (number * unit);
		System.out.println("사과 한 개에서\n0.7조각을 빼면 " + result + "조각이 남는다.");


	}

}
