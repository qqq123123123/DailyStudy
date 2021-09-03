package kr.or.shi.overriding01;

public class HddTest
{
    public static void main(String[] args) {
        HddDisk hddDisk = new HddDisk(500, 6400);
        UsbMemory usbMemory = new UsbMemory(32, 960);

        System.out.println(hddDisk.status());
        System.out.println();
        System.out.println(usbMemory.status());
        System.out.println(usbMemory.status(20));
    }
}