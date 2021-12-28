package kr.or.shi.interface05.case02;

public class MyClass implements MyInterface{

    @Override
    public void x() {
        System.out.println("X"); 
    }

    @Override
    public void y() {
        System.out.println("Y");
    }

    @Override
    public void myMethod() {
        System.out.println("MyMethod");
    }
    
}
