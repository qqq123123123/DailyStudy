package kr.or.shi.generic03;

/*
    1. 제네릭 프로그래밍이란
        1)  변수의 선언이나 메소드의 매개변수를 하나의 참조 자료형이 아닌
            여러 자료형을 변환될 수 있도록 프로그래밍 하는 방식.
        2)  실제 사용되는 참조 자료형의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 가능.

    2.  자료형 매개변수 T
        1)  Type의 의미로 T 사용
        2)  여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현.
    
    3.	컴파일러가 T를 해당 타입으로 변경해줌.
    
    4.	<T extends 클래스>
    	1)	상위 클래스 필요성
    		-	T 자료형의 범위를 제한할 수 있음.
    		-	상위 클래스에서 선언하거나 정의하는 메소드를 활용할 수 있음.
    		-	상속 받지 않는 경우 T는 Object 클래스가 기본으로 제공하는 메소드만 사용가능
*/

public class GenericPrinter<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    
    
}