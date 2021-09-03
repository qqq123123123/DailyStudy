package kr.or.shi.loop3;

/*
	사용자로부터 점수를 입력받아서
	A, B, C, D, E, F를 출력하는 프로그램을 작성하시오.
	단 사용자가 잘못된 점수를 입력했을 경우 올바른 형태의 점수를 입력할 때 까지 다시 입력받도록 하시오.

	---예시
	점수 : -10
	잘못 입력하셨습니다.
	점수 : 0

	F
*/

import java.util.*;

public class GradeCheckTest 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int score;

		while(true)
		{
			System.out.print("점수를 입력하세요: ");
			score = scan.nextInt();

			if(score >= 0 && score <= 100)
			{
				break;
			}

			System.out.println("잘못 입력하셨습니다.");
		}
		if(score >= 90 && score <=100)
		{
			System.out.println("A");
		}
		else if(score >=80 && score <90)
		{
			System.out.println("B");
		}
		else if(score >= 70 && score < 80)
		{
			System.out.println("C");
		}
		else if(score >= 60 && score < 70)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		System.out.println("score: " + score);

		scan.close();
	}

}
