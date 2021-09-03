package kr.or.shi.review;

/*
여러 개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾으세요.
배열의 몇 번째에 있는지 순서를 찾으세요.
반복문을 한번만 사용하여 문제를 해결하세요.
수 : [10, 55, 2, 23, 79, 16, 82, 101, 30, 45]

// MinMaxTest.java

[출력]
가장 큰 값은 101이고, 위치는 7번째 입니다.
가장 작은 값은 2이고, 위치는 4번째 입니다.

*/


public class MinMaxTest 
{
    public static void main(String[] args) 
    {
        int[] intArr = new int[]{10, 55, 2, 23, 79, 16, 82, 101, 30, 45};
        int max = 0;
        int maxLocation = 0;
        int min = 100;
        int minLocation = 0;
        for(int i = 0; i < intArr.length; i++)
        {
            if(max < intArr[i])
            {
                max = intArr[i];
                maxLocation = i;
            }
            if(min > intArr[i])
            {
                min = intArr[i];
                minLocation = i;
            }
        }

        System.out.println("가장 큰 값은 " + max +"이고, 위치는 " + (maxLocation + 1) + "번째 입니다.");
        System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + (minLocation + 1) +"번째 입니다.");
    }
}
