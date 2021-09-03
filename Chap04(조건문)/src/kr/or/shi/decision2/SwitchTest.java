package kr.or.shi.decision2;


public class SwitchTest 
{

	public static void main(String[] args) 
	{
		int score = 95;
		
		//	조건: int 이하의 정수값, String 값
		switch(score)
		{
			case 95:
				System.out.println("1 test");
				break;
			case 94:
				System.out.println("2 test");
				break;
			case 93:
				System.out.println("3 test");
				break;
			default:
				System.out.println("잘못된 값입니다.");
				break;
		}

	}

}
