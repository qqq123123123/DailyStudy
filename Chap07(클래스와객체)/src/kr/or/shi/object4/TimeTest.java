package kr.or.shi.object4;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        
        time.setHour(20);
        time.setMinute(50);
        time.setSecond(41);
        System.out.println(time.toString());
    }
}
