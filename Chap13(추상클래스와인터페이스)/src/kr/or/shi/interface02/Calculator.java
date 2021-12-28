package kr.or.shi.interface02;

public abstract class Calculator implements Calc{

    public Calculator()
    {

    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int substract(int x, int y) {
        return x - y;
    }

    
}
