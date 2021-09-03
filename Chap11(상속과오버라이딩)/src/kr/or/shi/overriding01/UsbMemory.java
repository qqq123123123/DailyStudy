package kr.or.shi.overriding01;

public class UsbMemory extends HddDisk 
{
    int capacity;
    int rpm;

    public UsbMemory(){}

    public UsbMemory(int capacity, int rpm)
    {
        this.capacity = capacity;
        this.rpm = rpm;
    }
    @Override
    public String status() {
        String str = "USB 용량: " + this.capacity + ", 속도: " + this.rpm + "rpm\n";
        return str;
    }
    //  오버로딩
    public String status(int i) {
        String str = "USB 용량2: " + i + "\n" + this.capacity + ", 속도: " + this.rpm + "rpm\n";
        return str;
    }
}
