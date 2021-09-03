package kr.or.shi.operator3;

import java.util.Scanner;

public class ThreeOperatorTest {
    public static void main(String[] args) {
        
        Scanner scan01 = new Scanner(System.in);

        System.out.println("점수를 입력하세요:");
        int score = scan01.nextInt();

        //삼항연산자
        //(조건식) ? 1(참) : 2(거짓)
        char grade = (score >= 90) ? 'A' : 'B';
        System.out.println("당신의 등급은: " + grade);

        //삼항연산자 중첩
        grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
        System.out.println("당신의 등급은: " + grade);
        scan01.close();
    }
}
