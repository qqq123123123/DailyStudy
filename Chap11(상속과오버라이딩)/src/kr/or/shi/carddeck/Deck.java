package kr.or.shi.carddeck;

public class Deck {
    final int CARD_NUM = 52;
    Card[] card = new Card[CARD_NUM];   //  2차원 배열로 초기화. 52개 짜리 카드(kind, num)배열


    public Deck()
    {
        int li = 0;
        {
           for(int i = Card.KIND_MAX; i > 0; i--)
            {
                for(int j = 0; j < Card.NUM_MAX; j++)
                {
                    card[li] = new Card(i, j);
                    li++;
                }
            }
        
        }
        for(int ise = 0; ise < CARD_NUM; ise++)
        {
        System.out.println(card[ise].toString());
        }
    }
    public Card pick(int index)
        {
            if(0 <= index && index < CARD_NUM)
            {
                return card[index];
            }
            else
            {
                return pick();
            }
        }
    public Card pick() {
        int index = (int)(Math.random()*CARD_NUM);
        System.out.print("임의로 뽑은 카드 ");
        System.out.printf("%d번은 ", index);
        return pick(index);
    }

    public void shuffle()
    {
        for(int n = 0; n < 1000; n++)
        {
            int i = (int)(Math.random()*52);
            Card temp = card[0];
            
        }
    }



}
