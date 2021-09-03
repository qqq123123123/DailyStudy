package kr.or.shi.polymorphism02;

public class CarTest {
    public static void main(String[] args) {
        Car car = null;
        SportCar sportCar = new SportCar();
        PoliceCar policeCar = new PoliceCar();

        sportCar.speedUp();
        // car = sportCar;
        // car.speedUp(); // 업캐스팅으로 인해 더 이상 사용불가 조작할 수 있는 멤버가 줄어듦.

        SportCar sportCar2 = null;
        // sportCar2 = (SportCar)car;  //  2.  다운캐스팅: 조작할 수 있는 멤버가 늘어남.
                                    //  다운캐스팅을 할 때는 반드시 명시적으로 형변환 코드를 작성해야함.
        sportCar2.speedUp();

        // sportCar = policeCar;		//	3.	서로 관련없는 클래스들간의 형변환: 서로 상속관계가 아니기 때문에 형 변환이 이루어질 수 없음.
        
    }
}
