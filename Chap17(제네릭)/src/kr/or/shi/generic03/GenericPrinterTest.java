package kr.or.shi.generic03;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        /*
            다이아몬드 연산자 <>
        */
        GenericPrinter<Powder> printer = new GenericPrinter<>();
        printer.setMaterial(powder);

        printer.getMaterial();
        
        //	추상 클래스로 인해 아무거나 타입으로 들어갈 수 없어짐.
        //        GenericPrinter<Water> printer3 =  new GenericPrinter<>();
        
    }
}
