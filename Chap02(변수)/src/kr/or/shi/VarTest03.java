package kr.or.shi;

public class VarTest03 {
    public static void main(String[] args) 
    {
        // int num = 10;
        // int bnum = 020;
        // int oNum = 0x20;
        // int xNum = 0x01;

        byte b1 = 127;
        //byte b2 = b1 + 2;
        byte b2 = (byte)(b1 + 2);
        System.out.println(b1);
        System.out.println("강제캐스팅 후: " + b2);
        
        int i1 = b1; //자동캐스팅 (형 변환 코드 생략가능)
        System.out.println("자동캐스팅 후: " + i1);
        
        byte b3 = 127;
        int i2 = 350;
        b3 = (byte)i2; // 큰 바이트 -> 작은 바이트 (데이터 손실 일어남)
        System.out.println(b3);
        
        /*
         * 정수와 실수간의 캐스팅
         * -> 저장하는 방식이 틀리기 때문에 반드시 데이터 손실이 있다.
         *    아울러 명시적 캐스팅 코드 들어가야함.
         */
        int i3 = 100;
        float f1 = i3; // 캐스팅 생략가능
        System.out.println("정수 -> 실수: " + f1);
        
        float f2 = 10.8f;
        int i4 = (int)f2;
        System.out.println("실수 -> 정수: " + i4);
        
        /*
         * any타입 + "" => 문자열 타입
         */
        int i5 = 100;
        String str = "java" + i5;
        System.out.println(str);
    }
}
