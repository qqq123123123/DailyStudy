package kr.or.shi.interface02;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999;

    public int add(int x, int y);
    public int substract(int x, int y);
    public int divide(int x, int y);
    public int times(int x, int y);

    default void description()
    {
        System.out.println("정수의 사칙연산 제공");
        myMethod();
        myStaticMethod();
    }

    static int total(int[] arr)
    {
        int total = 0;
        for(int num :arr)
        {
            total += num;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod()
    {
        System.out.println("myMethod");
    }
    private static void myStaticMethod()
    {
        System.out.println("myStaticMethod");
    }
    
}
