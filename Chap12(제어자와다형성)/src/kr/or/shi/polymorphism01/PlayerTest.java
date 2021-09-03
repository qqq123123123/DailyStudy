package kr.or.shi.polymorphism01;

public class PlayerTest {

	public static void main(String[] args) {
		//	다형성 미적용
		Player player1 = new Player("박지성", 40, 20, 60);
		player1.info();
		System.out.println();
		
		//	다형성 적용
		//	원타입은 벗어나지 못함. -> Skriker 클래스에 있는 getShoot()메소드 접근 불가.
		Player player2 = new Striker("손흥민", 25, 10, 90, 50);
		//	메소드에서 상속 관계에 있다면, 자손클래스에서 오버라이딩 시, 현재 참조하고 있는 인스턴스의 메소드를 호출함.
		player2.info();
		System.out.println();
		
		Player player3 = new MidFielder("이강인", 20, 11, 89, 120);
		player3.info();

		
		Player player4 = new Defender("김영권", 18, 3, 50, 2);
		player4.info();
	}

}
