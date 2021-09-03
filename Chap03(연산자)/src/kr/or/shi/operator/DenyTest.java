package kr.or.shi.operator;

public class DenyTest {

	public static void main(String[] args) {
		// !논리 부정 연산 == not 연산자 --> 반대값을 취하는 연산자

		boolean power = false;
		System.out.println("power의 값: " + power);

		power = !power;		
		System.out.println("power의 값: " + power);
		
		power = !power;		
		System.out.println("power의 값: " + power);

		if(!power)
		{
			System.out.println("if문 실행됨");
		}

		if(power)
		{
			System.out.println("if문 실행됨2");
		}
	}

}
