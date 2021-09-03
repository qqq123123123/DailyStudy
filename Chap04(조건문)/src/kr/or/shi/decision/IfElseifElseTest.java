package kr.or.shi.decision;

import java.util.*;

/*
	사용자로 부터 입력을 받아서 나이에 따라 입장료 받기
	< 8: 입장료 1000원
	< 14: 2000원
	< 20: 2500
	그 외: 3000
*/

public class IfElseifElseTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();

		if (age < 8)
		{
			System.out.println("미 취학 아동입니다. 입장료는 1000원 입니다.");
		}
		else if (age < 14)
		{
			System.out.println("초등학생입니다. 입장료는 2000원 입니다.");
		}
		else if (age < 20)
		{
			System.out.println("청소년입니다. 입장료는 2500원 입니다.");
		}
		else
		{
			
			System.out.println("성인입니다. 입장료는 3000원 입니다.");
		}

		scan.close();
	}

}
