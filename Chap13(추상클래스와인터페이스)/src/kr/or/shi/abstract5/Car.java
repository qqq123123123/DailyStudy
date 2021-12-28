package kr.or.shi.abstract5;

/*
    추상 클래스의 적용 (템플릿 메소드)

    1. 템플릿 메소드
        1)  추상 메소드나 구현된 메소드를 활용하여 시나리오(코드의 흐름)를 정의하는 메소드
        2)  final로 선언하여 하위 클래스에서 재정의 할 수 없게함.
        3)  프레임워크에서 많이 사용되는 설계패턴
        4)  추상 클래스로 선언된 상위 클래스에서 템플릿 메소드를 활용하여 전체적인 흐름을 정의하고 
            하위 클래스에서 다르게 구현되어 하는 부분은 추상메소드로 선언하여 하위 클래스에서 구현하도록 함.
        
*/

public abstract class Car 
{
	public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void run()
    {
        startCar();
        drive();
        stop();
        turOff();
    }

    public void startCar()
    {
        System.out.println("시동 on");
    }
    public void turOff()
    {
        System.out.println("시동 off");
    }

    
}
