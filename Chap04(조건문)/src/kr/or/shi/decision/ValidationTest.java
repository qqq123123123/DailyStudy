package kr.or.shi.decision;

/*
	검증 (validation)
	사용자가 입력한 데이터가 올바른 값인지 체크하여 올바른 값인 경우에만 프로그램 실행.
*/

import java.util.*;


public class ValidationTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("점수 입력: ");
		int score = scan.nextInt();
		
		if (score >= 90)
		{
			System.out.println("A");
		}
		else if (score >= 80)
		{
			System.out.println("B");
		}
		else if (score >= 70)
		{
			System.out.println("C");
		}
		else if (score >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}


		System.out.println("---정확한 값 범위 체크---");

		if (score >= 90 && score <= 100)
		{
			System.out.println("A");
		}
		else if (score >= 80 && score < 90)
		{
			System.out.println("B");
		}
		else if (score >= 70 && score < 80)
		{
			System.out.println("C");
		}
		else if (score >= 60 && score < 70)
		{
			System.out.println("D");
		}
		else if(score >= 0 && score < 60)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("---------입력 값 범위 체크--------");

		if(score >= 0 && score <=100)
		{
			System.out.println("0이상 100이하");
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}

		scan.close();

	}

}
