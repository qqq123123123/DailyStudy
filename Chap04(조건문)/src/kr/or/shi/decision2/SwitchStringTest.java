package kr.or.shi.decision2;


public class SwitchStringTest {

	public static void main(String[] args) {
		String str = "부장";

		switch(str)
		{
			case "부장":
				System.out.println("450만원");
				break;
			case "차장":
				System.out.println("400만원");
				break;
			case "과장":
				System.out.println("350만원");
				break;
			case "대리":
				System.out.println("250만원");
				break;
			case "사원":
				System.out.println("200만원");
				break;
			default:
				System.out.println("해당 없음");
				break;
		}


		int number = 6;

		switch(number)
		{
			case 6:
				System.out.println("6월 실행");
				break;
		}
	}

}
