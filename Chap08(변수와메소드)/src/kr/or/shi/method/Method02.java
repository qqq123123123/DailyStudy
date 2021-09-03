package kr.or.shi.method;

public class Method02 {

    public static void plusMethod(int a, int b)
    {
        System.out.println("인자로 넘겨받은 2개의 값은 " + a + "와 " + b + "");

        int result = a + b;
        System.out.println("두 수를 더한 값은 = " + result);
    }
    public static void main(String[] args) {
        //  메소드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 의미임.
        plusMethod(10, 20);
    }
}
