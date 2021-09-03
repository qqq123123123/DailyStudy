package kr.or.shi.loop3;

/*
	1. 증속 2. 감속 3. 중지

	1 > 속도+1
	2 > 속도-1
	3 > 탈출
*/

import java.util.*;

public class WhileTest2 {

	public static void main(String[] args) 
	{
		int speed = 0;

		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. 증속\t2. 감속\t3. 중지");
			System.out.print("입력: " );
			int choice = scan.nextInt();

			if(choice == 1)
			{
				speed += 1;
				System.out.println("현재 속도: " + speed);
			}

			else if(choice == 2)
			{
				speed -=1;
				System.out.println("현재 속도: " + speed);
			}

			else if(choice == 3)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}

		}
		

		scan.close();
	}

}
