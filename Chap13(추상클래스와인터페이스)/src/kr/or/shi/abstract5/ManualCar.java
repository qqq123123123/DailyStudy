package kr.or.shi.abstract5;

public class ManualCar extends Car{

    public ManualCar()
    {

    }

    @Override
    public void drive() {
        System.out.println("액셀 밟기");
        
    }

    @Override
    public void stop() {
        System.out.println("브레이크 밟기");
        
    }

    @Override
    public void wiper() {
        System.out.println("Manual wiping");    
    }
    
}
