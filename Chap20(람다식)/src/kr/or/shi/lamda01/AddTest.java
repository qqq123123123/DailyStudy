package kr.or.shi.lamda01;

public class AddTest {
	public static void main(String[] args) {
		Add addObj = (x, y) -> x + y;		
		//	{return x + y;}	// add() 구현
		System.out.println(addObj.add(3, 5));
		
	}
}
