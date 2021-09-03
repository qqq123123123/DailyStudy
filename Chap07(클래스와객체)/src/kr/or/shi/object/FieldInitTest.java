package kr.or.shi.object;

public class FieldInitTest {
    public static void main(String[] args) {
        
        /*
            new 연산자: 클래스에 있는 멤버들의 크기만큼 heap에 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 함.
        */

        
        FieldInit fInit = new FieldInit();
        System.out.println(fInit.intField);
        System.out.println(fInit.booleanField);
        System.out.println(fInit.floatField);
        System.out.println(fInit.arrField);

        System.out.println(fInit.toString());
    }
}
