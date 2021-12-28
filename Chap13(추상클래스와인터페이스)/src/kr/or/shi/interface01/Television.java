package kr.or.shi.interface01;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Television을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            System.out.println("Television 볼륨의 최대치 값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
         }
         else if(volume < RemoteControl.MIN_VOLUME) {
            System.out.println("Television 볼륨의 최소치 값은 1입니다.");
            this.volume = RemoteControl.MIN_VOLUME;
         }
         else {
            this.volume = volume;
         }
         System.out.println("현재 Television 볼륨 : " + this.volume);
    }
    
}
