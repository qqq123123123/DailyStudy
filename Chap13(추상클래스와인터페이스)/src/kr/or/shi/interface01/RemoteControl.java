package kr.or.shi.interface01;

public interface RemoteControl 
{
    //  상수(그냥 써도 기본 static final)
	int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    //  추상 메소드(그냥 써도 기본으로 abstract임)
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
