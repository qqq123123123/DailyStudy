package kr.or.shi.generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        /*
            다이아몬드 연산자 <>
        */
        GenericPrinter<Powder> printer = new GenericPrinter<>();
        printer.setMaterial(powder);

        printer.getMaterial();
    }
}
