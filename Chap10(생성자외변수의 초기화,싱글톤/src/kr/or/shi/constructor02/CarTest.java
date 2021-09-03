package kr.or.shi.constructor02;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);
		
		Car car2 = new Car("흰색", "오토", 5);			//직접 주문시
		System.out.println(car2);
		
		Car car3 = new Car(car);
		System.out.println(car3);
		
		Car car4 = new Car(car2);
		System.out.println(car4);
		System.out.println();
		
		for(int i=0; i<10; i++) {
			Car car1 = new Car(car2);
			System.out.println((i+1) +"번째 차 : "+ car1);
		}
	}

}





