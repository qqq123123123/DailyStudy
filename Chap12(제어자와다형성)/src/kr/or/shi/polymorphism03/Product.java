package kr.or.shi.polymorphism03;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price)
    {
        this.price = price;
        //  보너스 점수는 제품가격의 10%를 적립
        this.bonusPoint += (int)(price * 0.1);
    }

    

}
