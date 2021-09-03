package kr.or.shi.loop2;

import java.util.*;

public class InputGugudanTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("구구단을 출력합니다. \n몇 단 부터 출력할까요? ");
		int starts = scan.nextInt();

		System.out.println("끝 단은 얼마인가요?");
		int ends = scan.nextInt();

		for(int i = starts; i <= ends; i++)
		{
			System.out.println("======= "+ i +"단 =========");
			for(int j = 1; j < 10; j++)
			{
				System.out.println(i + " * " + j + " = " + i * j + "\t");
			}
		}


		scan.close();
	}

}
