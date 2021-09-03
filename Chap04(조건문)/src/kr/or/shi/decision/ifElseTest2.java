package kr.or.shi.decision;

/*
 * 사용자로부터 점수를 입력 받아서
	90 이상 > A
	80점대 > B
 	70점대 > C
	60점대 > D
	그 이하 F
 */

import java.util.*;

public class ifElseTest2 {

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

		scan.close();
	}

}


