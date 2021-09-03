package kr.or.shi.operator3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.printf("숫자 입력:");
		int number = scan.nextInt();
		System.out.println("사용자가 입력한 숫자: " + number);

		System.out.printf("실수 입력: ");
		double d = scan.nextDouble();
		System.out.println("사용자가 입력한 숫자: " + d);

		//	Scanner의 경우 nextInt(), nextDouble() 등의 숫자를 입력하는 메소드는 실행하면 버퍼 메모리에 엔터키가 남아있게 됨.
		//	그 후에 nextLine()을 사용하게 된다면 버퍼 메모리에 남아있는 엔터키 때문에 스캐너는 사용자가 아무런 내용없는 스트림을 입력했다고 착각함.
		//	--> 입력이 불가능해지는 버그
		//	해결법: scanner.nextLine() 사용 후 다시 입력 받기.
		System.out.printf("이름 입력: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.printf("사용자가 입력한 이름: [%s]\n", name);


		
		scan.close();
	}

}
