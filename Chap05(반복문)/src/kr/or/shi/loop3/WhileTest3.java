package kr.or.shi.loop3;

/*
	사용자로부터 숫자를 입력받아서
	해당 숫자가 음의 정수가 아닐 경우
	음의 정수를 입력할 때 까지 다시 입력을 하는 프로그램을 작성하시오..

	음의 정수를 입력해주세요: 9
	잘못 입력했습니다.
	음의 정수를 입력해주세요: -7
	사용자가 입력한 음의 정수: -7
*/

import java.util.*;

public class WhileTest3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("음의 정수를 입력해주세요: ");
			int num = scan.nextInt();

			if(num >= 0)
			{
				System.out.println("잘못 입력했습니다.");
			}
			else
			{
				System.out.println("사용자가 입력한 음의 정수: " + num);
				break;
			}
		}
		scan.close();
	}

}
