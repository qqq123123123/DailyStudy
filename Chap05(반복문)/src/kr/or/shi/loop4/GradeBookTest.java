package kr.or.shi.loop4;

/*
    사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받아 형식에 맞게 출력.
    번호 1~10 사이
    국영수 점수는 0~100 사이
    사용자가 잘못된 번호 혹은 점수를 입력하면 올바른 값이 입력될 때 까지 다시 입력하도록 설정.
*/

import java.util.*;

public class GradeBookTest 
{
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;

    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int id;
        String name;
        int korean;
        int english;
        int math;
        do
        {
            System.out.print("학생 번호 입력: ");
            id = scan.nextInt();
        }while(!(id >= 1 && id <= 10));
        
        System.out.print("학생 이름 입력: ");
        scan.nextLine();
        name = scan.nextLine();

        do
        {
            System.out.print("국어 점수 입력: ");
            korean = scan.nextInt();
        }while(!(korean >= 0 && korean <= 100));

        do
        {
            System.out.print("영어 점수 입력: ");
            english = scan.nextInt();
        }while(!(english >= 0 && english <= 100));

        do
        {
            System.out.print("수학 점수 입력: ");
            math = scan.nextInt();
        }while(!(math >= 0 && math <= 100));

        
		System.out.println("");
		System.out.printf("번호 : %03d번 이름: %s", id, name);
		System.out.printf("\n국어 : %03d점 영어 : %03d점 수학 : %03d점", korean, english, math);
		System.out.printf("\n총점 : %03d점 평균 : %06.2f점", (korean + english + math), (((float)korean + (float)math + (float)english ) / 3.0));
        

        scan.close();
    }
    
}
