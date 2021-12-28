package kr.or.shi.abstract5;

public class AICar extends Car{

    public AICar()
    {

    }

    @Override
    public void drive() {
        System.out.println("자율주행 drive");
        
    }

    @Override
    public void stop() {
        System.out.println("자율주행 stop");
        
    }

    @Override
    public void wiper() {
        System.out.println("AI wiping");
    }
    
}
