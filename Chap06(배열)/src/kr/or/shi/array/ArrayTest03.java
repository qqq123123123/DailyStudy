package kr.or.shi.array;

import java.util.Arrays;

public class ArrayTest03 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[10];

        //  배열에 난수 10개 대입

        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = (int)(Math.random() * 10 + 1);
            System.out.println(arr1[i]);
        }

        for(int i = 0; i < arr1.length; i++)
        {
            if(i != 9)
            {
                System.out.print(arr1[i] + ", ");
            }
            else
            {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();

        //  Arrays 클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
        System.out.println(Arrays.toString(arr1));

        //  6바이트가 힙에 생성됨.
        char[] chArr = new char[] {'a', 'b', 'c'};
        System.out.println(Arrays.toString(chArr));
        System.out.println();


        //  char타입은 주소를 출력하려면 toString()호출해야함.
        System.out.println(chArr);

        
    }
}
