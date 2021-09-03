package kr.or.shi.constructor01;

public class StudentTest {

	public static void main(String[] args) {
		
		//기본생성자 호출
		Student student = new Student();
		System.out.println(student.getAge());
		System.out.println(student.getName());

		//매개변수가 있는 생성자를 호출
		Student student2 = new Student("류현진", 35);
		System.out.println(student2);
		
		//매개변수가 있는 생성자를 호출
		Student student3 = new Student("이순신");
		System.out.println(student3);
		
		Student student4 = new Student(50);
		System.out.println(student4);
	}

}






