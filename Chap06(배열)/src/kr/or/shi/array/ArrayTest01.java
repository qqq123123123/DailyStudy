package kr.or.shi.array;

public class ArrayTest01 
{

	public static void main(String[] args) 
	{
		int[] score = null; //	참조변수
		// score = {100, 200}	//	메모리 할당이 안되어있는데 값을 대입하고 있음
		score = new int[5];	// 5개의 메모리 공간을 heap에 생성하고 있음.(20바이트)

		System.out.println("score의 주소값 : " + score);
		for(int i = 0; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		
		for(int i = 0; i < score.length; i++)
		{
			score[i] = 10 + i;
			System.out.println(score[i]);
		}
	}

}
