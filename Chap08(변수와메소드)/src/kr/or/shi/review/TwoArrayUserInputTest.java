package kr.or.shi.review;

import java.util.*;

public class TwoArrayUserInputTest {

	public static void main(String[] args) {
		
		// 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
		// 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.
		// TwoArrayUserInputTest.java

		/*
		[출력예시]

		행의 갯수를 입력하고 [Enter] 치세요 = 3
		열의 갯수를 입력하고 [Enter] 치세요 = 5
		1번째 행에 입력할 문자 5개를 차례대로 입력하고 [Enter] 치세요 = Korea
		2번째 행에 입력할 문자 5개를 차례대로 입력하고 [Enter] 치세요 = China
		3번째 행에 입력할 문자 5개를 차례대로 입력하고 [Enter] 치세요 = Ameri
		*/

		Scanner scan = new Scanner(System.in);

		System.out.print("행의 갯수를 입력하고 Enter > ");
		int line1 = scan.nextInt();
		System.out.print("열의 갯수를 입력하고 Enter > ");
		int line2 = scan.nextInt();
		scan.nextLine();

		String[] temp = new String[line1];

		// char[][] array = new char[line1][line2];
		
		for(int i = 0; i < line1; i++)
		{
			System.out.print( (i + 1) + "번째 행에 입력할 문자 5개를 차례대로 입력하고 Enter >");
			temp[i] = scan.nextLine();
		}
		
		for(int i = 0; i < line1; i++)
		{
			for(int j = 0; j < line2; j++)
			{
				System.out.print(temp[i].charAt(j));
			}
			System.out.println();
		}
		
		
		scan.close();


	}

}
