package kr.or.shi.polymorphism02;

/*
	instanceof 연산자의 결과가 true라는 것은
	실제 형변환이 가능하다는 것을 의미하고 상속관계에 있다는 것임.
*/


public class InstanceOfTest {

	public static void main(String[] args) {
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar)
		{
			System.out.println("sportCar로 타입변환이 가능합니다.");
		}
		// if(sportCar instanceof Car)
		// {
		// 	System.out.println("Car로 타입변환이 가능합니다.");
		// }
		if(sportCar instanceof Object)
		{
			System.out.println("Object로 타입변환이 가능합니다.");
		}
	}

}
