package kr.or.shi.interface05.case01;

public interface Sell {
    void sell();
    default void order()
    {
        System.out.println("판매 주문합니다.");
    }
}
