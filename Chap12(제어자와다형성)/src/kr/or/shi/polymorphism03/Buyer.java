package kr.or.shi.polymorphism03;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    public void buy(TV tv)
    {
        if(this.money < tv.price)
        {
            System.out.println("TV구매할 잔액이 부족합니다.");
            return;
        }
        this.money -= tv.price;
        this.bonusPoint += tv.bonusPoint;
        System.out.println(tv + "를 구매하셨습니다.");
    }

    public void buy(Audio audio)
    {
        if(this.money < audio.price)
        {
            System.out.println("TV구매할 잔액이 부족합니다.");
            return;
        }
        this.money -= audio.price;
        this.bonusPoint += audio.bonusPoint;
        System.out.println(audio + "를 구매하셨습니다.");
    }
    public void buy(Computer computer)
    {
        if(this.money < computer.price)
        {
            System.out.println("TV구매할 잔액이 부족합니다.");
            return;
        }
        this.money -= computer.price;
        this.bonusPoint += computer.bonusPoint;
        System.out.println(computer + "를 구매하셨습니다.");
    }
}
