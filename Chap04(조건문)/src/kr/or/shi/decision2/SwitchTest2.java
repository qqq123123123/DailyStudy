package kr.or.shi.decision2;

/*
	사용자로부터 월을 입력받아서 해당월의 마지막 날짜를 보여주는 프로그램 작성.
*/

import java.util.*;

public class SwitchTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("월 입력:");
		int month = scan.nextInt();

		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31일 입니다.");
				break;
			case 2:
				System.out.println("28일");
				break;
			default:
				System.out.println("30일");
				break;
		}

		scan.close();
	}

}
