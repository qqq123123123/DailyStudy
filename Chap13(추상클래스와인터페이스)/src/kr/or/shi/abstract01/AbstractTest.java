package kr.or.shi.abstract01;

/*
	추상 클래스
		-	클래스들의 공통적인 특징을 변수나 메소드로 정의만 해놓은 것.
		-	왜 사용하는가?	:	강제하기 위함 -> 추상 클래스가 선언해 놓은 메소드를 상속받은 자식 클래스들이 재정의하여 구현.
*/
abstract class Animal
{
	//	구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언.(추상 메소드)
	abstract void cry();
	public void eat()
	{
		System.out.println("먹다");
	}	
}

class Dog extends Animal
{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal
{
	@Override
	void cry() {
		System.out.println("냐옹");
	}
}

class Cow extends Animal
{
	@Override
	void cry() {
		System.out.println("음메");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		// Animal dog = new Animal(); 	//	추상 클래스는 구체적인 내용이 없기 때문에 객체 생성 불가

		Dog dog = new Dog();
		dog.cry();
		
	}

}
