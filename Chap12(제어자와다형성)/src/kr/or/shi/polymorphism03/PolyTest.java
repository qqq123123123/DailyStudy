package kr.or.shi.polymorphism03;

public class PolyTest {
    /*
        1)
    */
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new TV());

        System.out.println("현재 남은 돈: " + buyer.money + "포인트: " + buyer.bonusPoint);
        
        buyer.buy(new Audio());
        System.out.println("현재 남은 돈:" + buyer.money + "포인트: " + buyer.bonusPoint);
    }
}
