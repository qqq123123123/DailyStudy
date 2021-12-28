package kr.or.shi.interface01;

public class Audio implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        
    }

    @Override
    public void turnOff() {
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            System.out.println("Audio 볼륨의 최대치 값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
         }
         else if(volume < RemoteControl.MIN_VOLUME) {
            System.out.println("Audio 볼륨의 최소치 값은 1입니다.");
            this.volume = RemoteControl.MIN_VOLUME;
         }
         else {
            this.volume = volume;
         }
         System.out.println("현재 Audio 볼륨 : " + this.volume);
   
    }

    
}
