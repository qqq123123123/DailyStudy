package kr.or.shi.array2;

public class TwoDAraayTest02 {
    public static void main(String[] args) {
        int[][] score = new int[][]
        {
            {100, 70, 50},
            {70, 50, 30},
            {50, 80, 70},
            {55, 85, 77},
            {100, 80, 50}
        };
        int korTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;  //  국영수 총점
        int totalSum = 0;   //  개인별 총점의 합계
        double totalAvg = 0.0;  //  개인별 평균 점수

        System.out.println("번호\t국어\t영어\t수학\t총점\t");
        System.out.println("====================================");

        for(int i = 0; i < score.length; i++)
        {
            int sum = 0;    //  개인별 총점
            double avg = 0.0;   //  개인별 평균

            korTotal = score[i][0];
            engTotal = score[i][1];
            mathTotal = score[i][2];
            System.out.print(i+1);
            for(int j = 0; j < score[i].length; j++)
            {
                sum += score[i][j];
                System.out.print("\t" + score[i][j]);
            }

            totalSum += sum;
            avg = (double)sum / score[i].length;
            totalAvg += avg;

            System.out.println("\t" + sum + "\t" + avg + "\n");
        }

        System.out.println(korTotal);
        System.out.println(engTotal);
        System.out.println(mathTotal);
        System.out.println(totalSum);
        System.out.println(totalAvg);

    }
}
