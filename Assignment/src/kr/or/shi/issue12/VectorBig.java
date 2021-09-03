package kr.or.shi.issue12;

import java.util.*;

public class VectorBig {


    public static void main(String[] args) {
        Vector<Integer> intVec = new Vector<>();
        Scanner scan = new Scanner(System.in);

        Integer pushNum = 0;
        do
        {
            System.out.print("정수 입력(-1 입력 시 종료) >>" );
            pushNum = scan.nextInt();
            if(pushNum != -1)
            {
                intVec.add(pushNum);
            }
        }while(pushNum != -1);

        int result = printBig(intVec);
        System.out.println("제일 높은 값: " + result);
        
    }

    public static int printBig(Vector<Integer> intvec)
    {
        int result = 0;
        for(int i = 0; i < intvec.size(); i ++)
        {
            result = Math.max(result, intvec.get(i));
        }
        return result;
    }
}
