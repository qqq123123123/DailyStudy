package kr.or.shi.operator3;

public class AssignOperTest
{
    public static void main(String[] args) {
        //복합대입연산자

        int result = 0;
        result += 10;

        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

        result %= 10;
        System.out.println(result);

        result -= 10;
        System.out.println(result);
    }
}