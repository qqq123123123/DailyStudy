package kr.or.shi.polymorphism01;

public class MidFielder extends Player {
    private int assist = 0;

    public MidFielder(String name, int age, int backNumber, int speed, int assist) {
        super(name, age, backNumber, speed);
        this.assist = assist;
    }
    public int getAssist()
    {
        return this.assist;
    }

    public void info()
    {
        super.info();
        System.out.println("assist: " + getAssist());
    }
}
