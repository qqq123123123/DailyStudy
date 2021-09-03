package kr.or.shi.object3;

public class MonitorTest {
    public static void main(String[] args) {
        Monitor samsung = new Monitor();

        samsung.channel = 5;
        samsung.power();
        samsung.channelUp();

        samsung.channelDown();
        samsung.channelDown();

        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();

        samsung.volumeDown();
        samsung.volumeDown();

        System.out.println(samsung);
    }
}
