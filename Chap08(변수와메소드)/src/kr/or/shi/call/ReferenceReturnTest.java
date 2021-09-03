package kr.or.shi.call;

import java.util.Arrays;

public class ReferenceReturnTest {

	public static void main(String[] args) {
		int[] origin = new int[] {10,20,30,40,50};	//	원본배열
		int[] cloned = null;						//	타겟배열

		cloned = copy(origin);
		System.out.println(Arrays.toString(cloned));

		
	}

	//	리턴타입이 참조타입이 온 경우
	public static int[] copy(int[] arr)
	{
		int[] temp = new int[5];
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}
}
