package kr.or.shi.operator;

public class OperatorTest {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;

		int result = v1 + v2;
		System.out.println("결과: " + result);
		
		result = v1 - v2;
		System.out.println("결과: " + result);
		
		result = v1 / v2;
		System.out.println("결과: " + result);
		
		result = v1 * v2;
		System.out.println("결과: " + result);
		
		result = v1 % v2;
		System.out.println("결과: " + result);

		try 	
		{ 
			result = v1 / 0;
		}
		catch(Exception e)
		{
			System.out.println("예외 발생: " + e.toString());
		}

		result = ++v1 +	v1++;
		System.out.println(result + " v1: " + v1);
	}

}
