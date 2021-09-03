package kr.or.shi.array3;

import java.util.Arrays;

public class StringArrayTest {
    public static void main(String[] args) {
        
        String str = new String("자바");
        System.out.println(str);

        System.out.println(str.toString() + "\n");

        String[] str2 = new String[]
        {
            "안녕", "이순신", "류성룡"
        };

        for(int i = 0; i < str2.length; i++)
        {
            System.out.print(str2[i]+ " ");
        }
        System.out.println();
        //  Object 클래스는 모든 클래스의 최고조상
        System.out.println("String 배열의 주소 : " + str2);
        //  String 클래스는 Object클래스의 toString()을 오버라이딩 했기 때문에 값이 나옴.
        System.out.println("String 배열의 값: " + str2[0].toString());

        str2[0] = "정철";
        System.out.println(Arrays.toString(str2));

        for(String str0 : str2)
        {
            System.out.println(str0);
        }

    }
}
