package kr.or.shi.decision;

public class IfIfElseTest {

	public static void main(String[] args) {
		
		int score = 99;

		if (score > 90)
		{
			System.out.println("점수가 90보다 크다.");
		}
		if (score > 80)
		{
			System.out.println("점수가 80보다 크다.");
		}

		System.out.println("");

		/*
			if-else 구문은 50% 확률일 때 사용하는게 바람직함.
			else 구문 옆에는 조건문이 절대로 올 수 없다.
		*/
		if (score >= 90)
		{
			System.out.println("점수가 90이상 입니다.");
		}
		else
		{
			System.out.println("점수가 90미만 입니다.");
		}
	}

}
