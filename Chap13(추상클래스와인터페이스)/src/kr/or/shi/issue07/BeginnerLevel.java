package kr.or.shi.issue07;

public class BeginnerLevel extends PlayerLevel{

    
    @Override
    public void jump() {
        System.out.println("jump 못해요");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\t*** 초급자 레벨입니다. ***");
    }

    @Override
    public void turn() {
        System.out.println("turn 못해요");
    }
    
}
