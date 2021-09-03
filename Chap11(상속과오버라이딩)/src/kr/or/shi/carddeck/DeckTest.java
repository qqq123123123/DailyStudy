package kr.or.shi.carddeck;

public class DeckTest {

   public static void main(String[] args) {
      Deck deck = new Deck();
      
      Card card = deck.pick(0);
      System.out.print("카드 섞기 전 제일 위에 있는 카드 -> ");
      System.out.println(card.toString());
      
      card = deck.pick(51);
      System.out.print("카드 섞기 전 제일 아래에 있는 카드 -> ");
      System.out.println(card.toString());
      
      card = deck.pick(52);
      System.out.print("카드 섞기 전 제일 아래에 있는 카드 -> ");
      System.out.println(card.toString());
      
      deck.shuffle();
      card = deck.pick(0);
      System.out.print("카드 섞은 후 제일 위에 있는 카드 -> ");
      System.out.println(card.toString());
      
      card = deck.pick(51);
      System.out.print("카드 섞은 후 제일 아래에 있는 카드 -> ");
      System.out.println(card.toString());
      
      card = deck.pick();
      System.out.println(card.toString());
   }

}