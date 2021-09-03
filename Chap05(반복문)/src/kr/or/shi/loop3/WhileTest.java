package kr.or.shi.loop3;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= 100)
		{
			sum += i;
			i++;
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println();

		/*
			while문은 무한루프용으로 많이 사용함.
			if()문을 사용하여 특정조건을 만족했을 때 break문을 사용하여 탈출.
		*/

		int j = 1;
		while(true)
		{
			System.out.println(j);
			if(j>=100)
			{
				break;
			}
			j++;
		}

	}

}
