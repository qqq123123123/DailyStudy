package kr.or.shi.decision3;



public class RandomDecision {

	public static void main(String[] args) {

		//	Math.random 값은 0.0~0.9999... 사이 임의의 값을 발생시킴.
		System.out.println(Math.random());

		//	주사위 숫자: 랜덤하게 발생
		int num = (int)(Math.random()*6) + 1; // 원래는 0~5이지만 +1하여 1 ~ 6 랜덤
		System.out.println(num);

		if(num == 1)
		{
			System.out.println("1 나왔습니다.");
		}
		else if(num == 2)
		{
			System.out.println("2 나왔습니다.");
		}
		else if(num == 3)
		{
			System.out.println("3 나왔습니다.");
		}
		else if(num == 4)
		{
			System.out.println("4 나왔습니다.");
		}
		else if(num == 5)
		{
			System.out.println("5 나왔습니다.");
		}
		else if(num == 6)
		{
			System.out.println("6 나왔습니다.");
		}

		switch(num)
		{
			case 1:
				System.out.println("1 나왔습니다.");
				break;
			case 2:
				System.out.println("2 나왔습니다.");
				break;
			case 3:
				System.out.println("3 나왔습니다.");
				break;
			case 4:
				System.out.println("4 나왔습니다.");
				break;
			case 5:
				System.out.println("5 나왔습니다.");
				break;
			case 6:
				System.out.println("6 나왔습니다.");
				break;
		}
	}

}
