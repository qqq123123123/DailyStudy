package kr.or.shi.interface05.case01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        System.out.println("----");

        Buy buyer = customer;   //upcasting
        buyer.buy();
        buyer.order();

        Sell seller = customer; //upcasting
        seller.sell();
        seller.order();
    }
}
