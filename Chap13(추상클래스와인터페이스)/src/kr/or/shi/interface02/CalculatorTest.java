package kr.or.shi.interface02;

public class CalculatorTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(x, y));
        System.out.println(calc.substract(x, y));
        System.out.println(calc.times(x, y));
        System.out.println(calc.divide(x, y));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));

        

    }
    
}
