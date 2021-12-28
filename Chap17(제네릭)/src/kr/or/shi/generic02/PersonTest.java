package kr.or.shi.generic02;

public class PersonTest {

	public static void main(String[] args) {
		Person<String> person = new Person<>();
		person.setPerson("홍길동");
		
		System.out.println(person.getPerson());
		
		Person<Integer> person2 = new Person<>();
		person2.setPerson(25);
		int value = person2.getPerson();
		System.out.println(value);
		
		Person<Apple> applePerson = new Person<>();
		applePerson.setPerson(new Apple());
		System.out.println(applePerson.getPerson());
	}

}
