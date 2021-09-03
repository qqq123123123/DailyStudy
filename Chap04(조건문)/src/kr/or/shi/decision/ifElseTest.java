package kr.or.shi.decision;

import java.util.Scanner;

/*
	static으로 선언된 함수(메소드)나 변수, 상수 -> JVM에서 인스턴스 생성 없이 호출 가능
	자바 프로그램을 실행하면 static으로 지정된 메소드를 찾아서 먼저 메모리에 할당시킴.

	상수로 관리자의 id와 비밀번호를 만들고 사용자로부터 따로 id와 비밀번호를 입력받아서
	만약 관리자의 id와 비밀번호가 일치하면 
*/
public class ifElseTest 
{

	static final String ADMIN_ID = new String("admin"); // admin_id = "admin"; 으로도 생성 가능.
	static final String ADMIN_PASSWORD = "1216";

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("ID: ");
		String id = scan.nextLine();
		System.out.print("PASSWORD: ");
		String pwd = scan.nextLine();

		if(id.equals(ADMIN_ID) && pwd.equals(ADMIN_PASSWORD))
		{
			System.out.println("접속되었습니다.");
		}
		else
		{
			System.out.println("로그인 실패");
		}

		scan.close();
	}

}
