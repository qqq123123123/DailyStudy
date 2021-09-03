package kr.or.shi.initialize;

public class BlockTest {
	
	//인스턴스 초기화블럭 : 
	{
		System.out.println("인스턴스 초기화블럭 실행됨.");
	}
	
	static
	{
		System.out.println("정적 초기화블럭 실행됨.");
	}
	
	public BlockTest() {
		System.out.println("생성자 호출됨.");
	}

	public static void main(String[] args) 
	{
		BlockTest blockTest = new BlockTest();
	}
}
