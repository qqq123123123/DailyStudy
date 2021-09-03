package kr.or.shi.review;


public class MaxMinTest {
    public static void main(String[] args) {
        //랜덤으로 정수 10개의 값을 갖는 배열을 만들어 최댓값과 최솟값을 같이 출력해보시오.
        //이때, 랜덤 정수 값은 0~99 사이로 한다.
        //MaxMinTest.java

        /*
        [출력예시]

        31 74 52 81 35 61 24 99 57 65
        arr 배열내 최댓값 : 99
        arr 배열내 최솟값 : 24
        */

        int[] ranArray = new int[10];

        for(int i = 0; i < ranArray.length; i++)
        {
            ranArray[i] = (int)(Math.random() * 100);
            System.out.print(ranArray[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = 100;
        
        for(int i = 0; i < ranArray.length; i++)
        {
            max = Math.max(max, ranArray[i]);
            min = Math.min(min, ranArray[i]);
        }
        System.out.println("arr 배열 내 최댓값: " + max);
        System.out.println("arr 배열 내 최소값: " + min);
    }
}
