package kr.or.shi.call;

public class ReferenceParamTest {

	public static void main(String[] args) {

		int[] arr = new int[] {10, 20, 30, 40, 50};
		System.out.println("change() 메소드 호출 전 값: " + arr[0]);

		System.out.println("main() arr의 주소값: " + arr);
		System.out.println();
		//	배열명은 주소임.	call by reference
		change(arr);
		System.out.println("change() 메소드 호출 후의 값: " + arr[0]);
	}
	public static void change(int arr[])
	{
		arr[0] = 999;
		System.out.println("change() 메서드 내의 값: " + arr[0]);
		System.out.println("change() 메소드 내의 arr의 주소 값" + arr);
		System.out.println("");
		return;
	}
}
