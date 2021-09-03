package kr.or.shi.array2;

public class TwoDAraayTest01 {
    public static void main(String[] args) {
        //  [][] 대괄호의 갯수가 차원을 의미함.
        //  2차원 배열을 선언과 동시에 초기화

        int[][] score = new int[][] 
        {
            {100, 200, 300},
            {1000, 2000, 3000},
            {10, 20, 30},
            {60, 20, 40}
        };
        for(int i = 0; i < score.length; i++)
        {
            for(int j = 0; j < score[i].length; j++)
            {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2차원 배열의 주소: " + score);
        System.out.println("2차원 배열의 크기: " + score.length);

        //  2차원 배열에서는 1차원 배열명도 주소가 되고, 2차원 배월명도 주소가 됨.
        for(int i = 0; i < score.length; i++)
        {
            System.out.println("1차원 배열의 주소: " + score[i]);
            System.out.println("1차원 배열의 크기: " + score[i].length);
        }

        //  향상된 for문
        //  collection framework 객체에 접근할 때, 자주 사용하는 방법임
        //  for(가져올 타입 : 가져올 장소)
        int sum = 0;
        for(int[] temp : score)
        {
            for(int i : temp)
            {
                sum += i;
            }
        }
        System.out.println("합계: " + sum );
    }
}
