package kr.or.shi.abstract03;

/*
    추상 클래스는 주로 상속의 상위클래스로 사양됨.
    추상 메소드 :    하위 클래스가 구현해야 하는 메소드
    구현된 메소드   :   하위 클래스가 공통으로 사용하는 기능의 메소드를 하위 클래스에 따라 재정의 할 수 있다.
*/

public abstract class Phone {

    private int serialNo;
    private String company;
    private String owner;
    public Phone(int serialNo, String company, String owner) {
        this.serialNo = serialNo;
        this.company = company;
        this.owner = owner;
    }
	public int getSerialNo() {
		return serialNo;
	}
	public String getCompany() {
		return company;
	}
	public String getOwner() {
		return owner;
	}

    public abstract void turnOn();
    public abstract void turnOff();

    public void showInfo()
    {
        System.out.println("시리얼 넘버:" + this.getSerialNo());
        System.out.println("제조회사: " + this.getCompany());
        System.out.println("소유자: " + this.getOwner());
    }
    
}
