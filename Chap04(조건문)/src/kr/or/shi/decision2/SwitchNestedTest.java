package kr.or.shi.decision2;

public class SwitchNestedTest {

	public static void main(String[] args) {
		
		int number = 1;
		int number2 = 1;
		//정형화 된 값, 정해져 있는 값들에게는 switch문이 가독성이 좋다.
		switch(number) 
		{
			case 1:
				switch(number2) 
				{
					case 1:
						System.out.println("011이시군요.");
						break;
					case 7:
						System.out.println("017이시군요.");
						break;
					case 9:
						System.out.println("019이시군요.");
				}
				break;
		}

	}
}


