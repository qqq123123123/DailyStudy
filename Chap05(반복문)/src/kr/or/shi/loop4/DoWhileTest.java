package kr.or.shi.loop4;

import java.util.*;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		String str = null;

		/*
			do-while문은 최소 한 번 이상 수행하는 반복문임. 이유는 조건문이 뒷부분에 존재하기 때문.
		*/
		do
		{
			System.out.print(">>");
			str = scan.nextLine();
			System.out.println("입력받은 메세지: " + str);
		}while(!str.equals("q"));

		System.out.println("프로그램을 종료합니다.");

		scan.close();
	}

}
