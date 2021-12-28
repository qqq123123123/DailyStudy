package kr.or.shi.abstract03;

public class PoldablePhone extends Phone{

    public PoldablePhone(int serialNo, String company, String owner) {
        super(serialNo, company, owner);
    }

	@Override
	public void turnOn() {
		System.out.println("폴더블 폰이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("폴더블 폰이 꺼졌습니다.");
	}

    public void foldOn()
    {
        System.out.println("폴더 기능이 사용됩니다.");
    }
    public void foldOff()
    {
        System.out.println("폴더 기능이 중지됩니다.");
    }
    
    
}
