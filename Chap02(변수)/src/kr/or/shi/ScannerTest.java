package kr.or.shi;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Ctrl + Shift + o : 자동 import
		 * scanner 클래스: 입력을 받기 위한 클래스이고, 입력스트림임.
		 * 자원(Resource)은 사용하고 나서 반드시 닫아줘야 함.
		 */
		
//		System.out.print("정수 한자리 입력: ");
//		int num = scanner.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자: " + num);
//		
//		System.out.print("실수 한자리 입력: ");
//		double d1 = scanner.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자: " + d1);
		
//		System.out.print("문자열 입력: ");
		/*
		 * next(): 공백을 기준으로 문자열 입력 --> 단어 입력 시 사용
		 * nextLine(): 엔터키를 입력할때까지 문자열을 입력 --> 문장을 입력 시 사용.
		 */
//		String str = scanner.nextLine();
//		System.out.println("사용자로부터 입력받은 문자열: " + str);
		
		System.out.print("문자열을 입력(숫자) : ");
		int result = 100;
		String num2 = scanner.nextLine();
		int temp = Integer.parseInt(num2);
		int total = result + temp;
		System.out.println("연산결과: " + total);
		
		
		scanner.close();
	}

}
