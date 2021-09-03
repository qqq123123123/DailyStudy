package kr.or.shi.sanghyeon;


import java.util.*;

public class DecisionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("자신의 연령대를 입력하세요 : ");
		int age = scan.nextInt();

		if(age < 10)
		{
			System.out.println("최소 10 이상만 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}

		else if(age > 10 && age <20)
		{
			System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		else if(age > 20 && age <30)
		{
			System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		else if(age > 30 && age <40)
		{
			System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		else if(age > 40 && age <50)
		{
			System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		else if(age > 50 && age < 60)
		{
			System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}

		switch(age)
		{
			case 10:
				System.out.println("10대입니다. 참고서 코너는 A구역 입니다.");
				break;

			case 20:
				System.out.println("20대입니다. 취업 서적 코너는 B구역 입니다.");
				break;

			case 30:
				System.out.println("30대입니다. 자기 계발 코너는 C구역 입니다.");
				break;
			case 40:
				System.out.println("40대입니다. 재테크 코너는 D구역 입니다.");
				break;

			case 50:
				System.out.println("50대입니다. 재취업 코너는 E구역 입니다.");
				break;

			case 60:
			case 70:
			case 80:
				System.out.println("60대 이상 입니다. 건강/장수 코너는 F구역 입니다.");
				break;
		}

		// System.exit(0); 종료함수
		scan.close();
	}

}
