package kr.or.shi.transport;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String name, int money)
	{
		this.studentName = name;
		this.money = money;
	}
	public void takeBus(Bus bus)
	{
		bus.take(1400);
		this.money -= 1400;
	}
	public void takeSubway(Subway Subway)
	{
		Subway.take(1200);
		this.money -= 1200;
	}

	@Override
	public String toString() {
		return this.studentName + "님의 남은 돈은 " + this.money + "원 입니다.";
	}
}
