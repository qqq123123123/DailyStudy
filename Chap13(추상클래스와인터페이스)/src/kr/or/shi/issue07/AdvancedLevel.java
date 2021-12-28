package kr.or.shi.issue07;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void jump() {
        System.out.println("높이 점프합니다.");
    }

    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\t*** 중급자 레벨입니다. ***");
    }

    @Override
    public void turn() {
        System.out.println("turn 못해요");
    }
    
}