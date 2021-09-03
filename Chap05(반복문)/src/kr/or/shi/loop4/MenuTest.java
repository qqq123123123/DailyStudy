package kr.or.shi.loop4;

import java.util.*;

/*
    무한루프를 이용한 프로그램.
*/

public class MenuTest 
{
    static int id;
    static String name;
    static int korean;
    static int english;
    static int math;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);


        while(true)
        {
            System.out.println("\n===============================");
            System.out.println(" SCT대학교 성적관리 프로그램");
            System.out.println("   1.입력   2.출력   3.종료");
            System.out.println("===============================");

            int userChoice = scan.nextInt();

            if(userChoice == 1)
            {
                System.out.print("학생 번호 입력: ");
                id = scan.nextInt();
                while(!(id >= 1 && id <= 10))
                {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("학생 번호 입력: ");
                    id = scan.nextInt();
                }
                
                System.out.print("학생 이름 입력: ");
                scan.nextLine();
                name = scan.nextLine();

                System.out.print("국어 점수 입력: ");
                korean = scan.nextInt();

                while(!(korean >= 0 && korean <= 100))
                {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("국어 점수 입력: ");
                    korean = scan.nextInt();
                }

                System.out.print("영어 점수 입력: ");
                english = scan.nextInt();

                while(!(english >= 0 && english <= 100))
                {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("영어 점수 입력: ");
                    english = scan.nextInt();
                }

                System.out.print("수학 점수 입력: ");
                math = scan.nextInt();

                while(!(math >= 0 && math <= 100))
                {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("수학 점수 입력: ");
                    math = scan.nextInt();
                }
            }
            else if(userChoice == 2)
            {
                if(id >= 1 && id <= 10)
                {
                    System.out.println("");
                    System.out.printf("번호 : %03d번 이름: %s", id, name);
                    System.out.printf("\n국어 : %03d점 영어 : %03d점 수학 : %03d점", korean, english, math);
                    System.out.printf("\n총점 : %03d점 평균 : %06.2f점\n", (korean + english + math), (((float)korean + (float)math + (float)english ) / 3.0));
                }
                else
                {
                    System.out.println("입력된 정보가 없습니다.");
                }
            }

            else if(userChoice == 3)
            {
                System.out.println("사용해주셔서 감사합니다.");
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
