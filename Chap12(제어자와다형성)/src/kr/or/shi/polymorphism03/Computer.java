package kr.or.shi.polymorphism03;

public class Computer extends Product{
    public Computer()
    {
        super(200);
    }
    @Override
    public String toString() {
        return "Computer";
    }
}
