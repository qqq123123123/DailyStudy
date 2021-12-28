package kr.or.shi.issue06;

public abstract class Car {

    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void run()
    {
        start();
        drive();
        stop();
        turnOff();
    }
}

class Sonata extends Car{

    public Sonata()
    {

    }

    @Override
    public void start() {
        System.out.println("Sonata turnOn");
    }

    @Override
    public void drive() {
        System.out.println("Sonata Drive");
        
    }

    @Override
    public void stop() {
        System.out.println("Sonata Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Sonata turnOff");
    }

}

class Avante extends Car
{

    public Avante()
    {

    }

    @Override
    public void start() {
        System.out.println("Avante turnOn");
    }

    @Override
    public void drive() {
        System.out.println("Avante Drive");
        
    }

    @Override
    public void stop() {
        System.out.println("Avante Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Avante turnOff");
    }
    
}

class Grandeur extends Car
{

    public Grandeur()
    {

    }

    @Override
    public void start() {
        System.out.println("Grandeur turnOn");
    }

    @Override
    public void drive() {
        System.out.println("Grandeur Drive");
        
    }

    @Override
    public void stop() {
        System.out.println("Grandeur Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Grandeur turnOff");
    }

}

class Genesis extends Car
{

    public Genesis()
    {

    }

    @Override
    public void start() {
        System.out.println("Genesis turnOn");
    }

    @Override
    public void drive() {
        System.out.println("Genesis Drive");
        
    }

    @Override
    public void stop() {
        System.out.println("Genesis Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Genesis turnOff");
    }
    
}
