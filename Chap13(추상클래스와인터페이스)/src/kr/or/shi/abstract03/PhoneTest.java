package kr.or.shi.abstract03;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(20210826, " Samsung", "이재용");
        smartPhone.showInfo();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();

        System.out.println("---------------------------");

        PoldablePhone polder = new PoldablePhone(20210901, "samsung", "이건희");

        polder.showInfo();
        polder.turnOn();
        polder.turnOff();
        polder.foldOn();
        polder.foldOff();

        System.out.println("-------------------------------");
        Phone[] phones = new Phone[10];
        phones[0] = new SmartPhone(20211001, "Apple", "스티브 잡스");
        phones[1] = new PoldablePhone(20211101, "샤오미", "ㅉㄲ");
        
        phones[0].showInfo();
        phones[1].turnOn();
    }
}