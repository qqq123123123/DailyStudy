package kr.or.shi.operator3;

import java.util.*;

/*
	입력 받은 두 수 중 큰 수를 출력하시오
	입력1: 90
	입력2: 89
	90
*/

public class ConditionTest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.print("입력1: ");
		int num1 = scan.nextInt();
		System.out.print("입력2: ");
		int num2 = scan.nextInt();


		System.out.println(num1 > num2 ? num1 : num2);

		scan.close();

	}

}
