package kr.or.shi.staticmethod;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int addResult = cal.add(100, 200);
        System.out.println("인스턴스 메소드 add() 호출결과: " + addResult);

        //  static 호출
        long mulResult = Calculator.mul(100, 200);
        System.out.println("static 메소드 mul() 호출 결과: " + mulResult);

        //  정적 메소드 예(선언부에 static 제어자가 붙어있음)
        Integer.parseInt("100");
        Math.random();
    }
}
