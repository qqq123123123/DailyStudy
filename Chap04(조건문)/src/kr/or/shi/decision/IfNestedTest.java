package kr.or.shi.decision;

import java.util.*;

public class IfNestedTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		int score = scan.nextInt();
		
		if(score >= 90)
		{
			if(score >= 95)
			{
				System.out.println("당신은 A+ 등급입니다.");
			}
			System.out.println("당신은 A 등급입니다.");
		}

		else if(score >= 80)
		{
			if(score >= 85)
			{
				System.out.println("B+");
			}
			System.out.println("B");
		}
		
		else
		{
			System.out.println("C+");
		} 

		scan.close();
	}

}
