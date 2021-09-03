package kr.or.shi.decision;

import java.util.*;

public class IfelseIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();

		//	스코어 변수에 따라서 아래 조건문에서 분기가 일어남.

		if(score >= 90)
		{
			System.out.println("점수가 90~100점 사이입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("점수가 80~89점 사이입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("점수가 70~79점 사이입니다.");
		}
		else
		{
			System.out.println("점수가 70점 미만입니다.");
		}


		scan.close();
	}

}
