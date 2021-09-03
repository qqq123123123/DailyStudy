package kr.or.shi.call;

class A
{
	int data;
}



public class PrimitiveParamTest {

	public static void main(String[] args) {
		A a = new A();
		a.data = 77;
		System.out.println("메소드 호출 전 main내의 값" + a.data);
		
		PrimitiveParamTest.dataChange(a);
		
		System.out.println("\n메소드 호출 후 main()내의 값: " + a.data);
	}
	public static void dataChange(A a)
	{
		//	a의 주소 값이 매개변수로 넘어옴	->	참조변수 형태
		//	호출한 곳으로 부터 영향을 받음.
		a.data = 44;
		System.out.println("Datachange() 내의 값: " + a.data);
		return;
	}

}
