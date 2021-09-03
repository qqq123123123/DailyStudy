package kr.or.shi.array3;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] origin = new int[] {10, 77, 33, 50};
        int[] target = new int[10];
        // int count = 0;

        System.out.println("복사하기 전");
        System.out.println("target 길이 : " + target.length);
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(target));
        System.out.println(target);

        //  1) 복사방법: for문 이용 직접 복사
        // for(int i = 0; i < origin.length; i++)
        // {
        //     target[i] = origin[i];
        // }

        //  2) 복사방법: 향상된 for문
        // for(int i : origin)
        // {
        //     target[count++] = i;
        // }

        //  3) 복사방법: 시스템 배열복사 함수(제일 빠름)
        // System.arraycopy(origin, 0, target, 0, origin.length);

        //  4) 복사방법: 배열복사(메소드, 원본배열과 동일하게 복사를 함)
        target = Arrays.copyOf(origin, origin.length);
        System.out.println("복사 후");
        System.out.println("target 길이 : " + target.length);
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(target));
        System.out.println(target);

        
        
    }
    
}
