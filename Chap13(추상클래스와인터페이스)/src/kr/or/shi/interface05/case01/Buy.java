package kr.or.shi.interface05.case01;

public interface Buy {
    void buy();
    public default void order()
    {
        System.out.println("구매 주문합니다.");
    }

}