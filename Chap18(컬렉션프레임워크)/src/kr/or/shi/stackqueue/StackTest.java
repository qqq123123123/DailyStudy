package kr.or.shi.stackqueue;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(1));
        coinBox.push(new Coin(2));
        coinBox.push(new Coin(3));
        coinBox.push(new Coin(4));
        coinBox.push(new Coin(5));
        

        while(!coinBox.empty())
        {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue());
        }
    }
    
}
