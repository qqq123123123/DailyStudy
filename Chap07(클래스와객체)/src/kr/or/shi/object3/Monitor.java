package kr.or.shi.object3;

public class Monitor 
{
    //  멤버변수(필드)
    //  모니터 기능들
    String color;   //  모니터 색상
    int channel;    //  채널
    int volume;     //  소리 크기
    boolean power;  //  전원(on, off)

    //  멤버 메소드
    public void power()
    {
        if(power = false)
        {
            System.out.println("모니터가 켜졌습니다.");
            // this.power = true;
            this.power = !power;
        }
        else
        {
            System.out.println("모니터가 꺼졌습니다.");
            // this.power = false;
            this.power = !power;
        }
    }

    public void channelUp()
    {
        this.channel++;
        System.out.println("현재 채널: " + this.channel);
    }
    public void channelDown()
    {
        this.channel--;
        System.out.println("현재 채널: " + this.channel);
    }

    public void volumeUp()
    {
        this.volume++;
        System.out.println("현재 음량: " + this.volume);
    }
    public void volumeDown()
    {
        this.volume--;
        System.out.println("현재 음량: " + this.volume);
    }

    @Override
    public String toString() {
        
        return "현재 채널: " + this.channel + " 현재 볼륨: " + this.volume;
    }
}
