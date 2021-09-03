package kr.or.shi.decision;

import java.util.*;


/*
	사용자로부터 성별, 나이, 신체등급 순으로 입력 받아서
	신체등급 1~3: 현역
	신체등급 4: 공익
	그 외: 면제 

	단 성별을 입력받을 시에는 int로 입력 받아 1 = 남자, 2 = 여자로 판단합니다.
	여자의 경우 "여성에게는 국방의 의무가 없습니다." 출력
	남자이지만 미성년자일 경우 "미성년자에게는 신체등급이 부여되지 않습니다." 출력
*/

public class ifNestedTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("성별을 입력하세요 남자 = 1, 여자 = 2 입력 >>");
		int sex = scan.nextInt();

		if(sex == 1)
		{
			System.out.print("나이를 입력하세요.");
			int age = scan.nextInt();
			if(age > 19)
			{
				System.out.print("신체등급을 입력하세요");
				int grade = scan.nextInt();
				if(grade == 1 || grade == 2 || grade == 3)
				{
					System.out.println("축하드립니다. 현역입니다.");
				}
				else if(grade == 4)
				{
					System.err.println("공익입니다.");
				}
				else
				{
					System.out.println("면제");
				}
			}
			else
			{
				System.out.println("미성년자에게는 신체등급이 부여되지 않습니다.");
			}
		}
		else if(sex == 2)
		{
			System.out.println("여성에게는 국방의 의무가 없습니다.");
		}
		else
		{
			System.out.println("error");
		}
		
		scan.close();
	}

}
