package kr.or.shi.interface05.case02;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        X xClass = myClass;     //upcasting
        xClass.x();

        Y yClass = myClass;     //upcasting
        yClass.y();

        MyClass iClass = myClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();
    }
    
}
