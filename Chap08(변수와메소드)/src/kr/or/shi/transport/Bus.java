package kr.or.shi.transport;

/*
 * 버스(지하철) 타고 sct로 가는 학생의 과정을 oop 구현하시오.
 * 
 */
public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	}
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	@Override
	public String toString() {
		return busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수익은 " + money + "원 입니다.";
	}
}
