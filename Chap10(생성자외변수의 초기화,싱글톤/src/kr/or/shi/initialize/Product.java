package kr.or.shi.initialize;

public class Product {

	static int number = 0;
	int countNo = 0;
	int[] arr = new int[10];

	//인스턴스 초기화블럭 : 
	{
		System.out.println("인스턴스 초기화블럭 실행됨.");
		++number;
		this.countNo = Product.number;

		for(int i = 0; i < arr.length; i ++)
		{
			this.arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	static
	{
		System.out.println("정적 초기화블럭 실행됨.");
	}
	
	public Product() {
		System.out.println("생성자 호출됨.");
	}


}
