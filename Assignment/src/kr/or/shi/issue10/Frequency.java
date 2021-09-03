package kr.or.shi.issue10;

/*
 * 빈도 수 구하기
 * 
 */

public class Frequency {

	public static void main(String[] args) {
		int[] intArr = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i = 0; i < intArr.length; i++)
		{
			switch(intArr[i])
			{
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			}
		}
			System.out.println("0 --> " + count0 + "회");
			System.out.println("1 --> " + count1 + "회");
			System.out.println("2 --> " + count2 + "회");
			System.out.println("3 --> " + count3 + "회");
	}

}
