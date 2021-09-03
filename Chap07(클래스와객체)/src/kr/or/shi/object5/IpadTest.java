package kr.or.shi.object5;

public class IpadTest {
    public static void main(String[] args) {
        Ipad ipad = new Ipad();
        ipad.setCompamy("Apple");
        ipad.setModel("iPad Pro");
        ipad.setRelease(2021);
        ipad.setColor("실버");
        System.out.println(ipad.toString());

        Ipad ipad2 = new Ipad();
        ipad2.setCompamy("samsung");
        ipad2.setModel("galaxy");
        ipad2.setRelease(2020);
        ipad2.setColor("네이비");
        System.out.println(ipad2.toString());
    }

}
