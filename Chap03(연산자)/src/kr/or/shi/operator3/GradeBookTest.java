package kr.or.shi.operator3;

import java.util.*;

/*
	사용자로부터 번호, 이름, 국어, 영어, 수학 점수순으로 입력 받아서
	다음과 같은 양식대로 출력이 되도록 프로그램을 작성하시오.

	예시
	번호 : 3
	이름 : 류현진
	국어 : 80
	영어 : 79
	수학 : 80

	결과값--
	번호 : 003번 이름: 류현진
	국어 : 080점 영어 : 079점 수학 : 080점
	총점 : 239점 평균: 079.67점
*/
public class GradeBookTest {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);

		System.out.printf("번호 : ");
		int number = scan1.nextInt();
		System.out.printf("\n이름 : ");
		scan1.nextLine();
		String name = scan1.nextLine();
		System.out.printf("\n국어 : ");
		int korean = scan1.nextInt();
		System.out.printf("\n영어 : ");
		int english = scan1.nextInt();
		System.out.printf("\n수학 : ");
		int math = scan1.nextInt();

		System.out.println("");
		System.out.printf("번호 : %03d번 이름: %s", number, name);
		System.out.printf("\n국어 : %03d점 영어 : %03d점 수학 : %03d점", korean, english, math);
		System.out.printf("\n총점 : %03d점 평균 : %06.2f점", (korean + english + math), (((float)korean + (float)math + (float)english ) / 3.0));

		scan1.close();
	}

}
