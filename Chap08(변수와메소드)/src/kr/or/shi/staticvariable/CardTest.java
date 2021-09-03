package kr.or.shi.staticvariable;

public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card();
        
        card1.setColor("노랑");
        card1.setCompany("국민은행");
        System.out.println(card1);

        Card.height = 80;
        Card.width = 150;

        Card card2 = new Card();
        card2.setColor("파랑");
        card2.setCompany("농협");
        System.out.println(card2);

        
    }
}
