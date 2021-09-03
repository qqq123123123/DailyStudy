package kr.or.shi.carddeck;

public class Card 
{
	static final int KIND_MAX = 4;	//	카드 무늬 개수
	static final int NUM_MAX = 13;	//	무늬별 카드 수

	//	무늬를 상수로 지정
	static final int SPADE = 4;
	static final int DIA = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;
	public Card(int kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		String kind = "";
		String number = "";

		switch(this.kind)
		{
			case 4:
				kind = "SPADE";
				break;
			case 3:
				kind = "DIA";
				break;
			case 2:
				kind = "HEART";
				break;
			case 1:
				kind = "CLOVER";
				break;
		}

		switch(this.number)
		{
			case 13:
				number = "K";
				break;
			case 12:
				number = "Q";
				break;
			case 11:
				number = "J";
				break;
			default:
				number = this.number + "";
		}
		return "무늬: " + kind + ", 숫자: " + number + "\n";
	}
}
