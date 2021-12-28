package kr.or.shi.generic;

/*
    1. 제네릭 프로그래밍이란
        1)  변수의 선언이나 메소드의 매개변수를 하나의 참조 자료형이 아닌
            여러 자료형을 변환될 수 있도록 프로그래밍 하는 방식.
        2)  실제 사용되는 참조 자료형의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 가능.

    2.  자료형 매개변수 T
        1)  Type의 의미로 T 사용
        2)  여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현.
    
    3. 컴파일러가 T를 해당 타입으로 변경해줌.
*/

public class GenericPrinter<T> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    
    
}