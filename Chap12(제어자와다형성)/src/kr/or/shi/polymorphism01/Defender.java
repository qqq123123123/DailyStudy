package kr.or.shi.polymorphism01;

public class Defender extends Player {
    private int sliding = 0;

    public Defender(String name, int age, int backNumber, int speed, int sliding) {
        super(name, age, backNumber, speed);
        this.sliding = sliding;
    }

    public int getSliding()
    {
        return this.sliding;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("sliding 횟수: " +getSliding() );
    }

    

    
}
