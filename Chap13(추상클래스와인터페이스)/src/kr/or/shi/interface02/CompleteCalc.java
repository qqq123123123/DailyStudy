package kr.or.shi.interface02;

public class CompleteCalc extends Calculator{

    public CompleteCalc()
    {

    }

    @Override
    public int divide(int x, int y) {
        if(y == 0)
        {
            return ERROR;
        }
        
        return x / y;
    }

    @Override
    public int times(int x, int y) {
        return x * y;
    }
    
    public void showInfo()
    {
        
    }
}
