package kr.or.shi.transport;

public class TakeTransTest {
    public static void main(String[] args) {
        /*
            이준형님의 남은 돈은 10000원 입니다.
            한상헌님의 남은 돈은 15000원 입니다.
            609번 버스의 승객은 1명이고, 수입은 1400원 입니다.
            지하철 2호선의 승객은 1명이고, 수입은 1200원 입니다.
        */

        Student lee = new Student("이준형", 10000);
        Student han = new Student("한상헌", 15000);

        Bus bus = new Bus(609);
        Subway subway = new Subway(2);
        System.out.println(lee);
        System.out.println(han);

        lee.takeBus(bus);
        han.takeSubway(subway);

        System.out.println(lee.toString());
        System.out.println(han.toString());
        System.out.println(bus.toString());
        System.out.println(subway.toString());
        
    }   
}
