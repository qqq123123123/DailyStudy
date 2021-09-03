package kr.or.shi.modifier;

/*
 * 	접근 제한자(access modifier)의 가시성
 *	-------------------------------------------------------------------
 *			외부 클래스		하위 클래스		동일	패키지	내부	클래스
 *  -------------------------------------------------------------------
 * 	public		O			O			O			O
 * 	-------------------------------------------------------------------
 * 	protected	X			O			O			O
 * 	-------------------------------------------------------------------
 * 	선언되지 않음
 * 	(default)	x			X			O			O
 * 	-------------------------------------------------------------------
 * 	private		X			X			X			O
 */

public class Phone {
	//	접근제어자 protected:	같은 패키지, 상속한 경우 접근 가능
	//						다른 패키지에서 접근 불가
	protected String model;
    private String color;
    private String company;
    
    
    
    
    public Phone()
    {
        
    }

    public Phone(String model, String color, String company)
    {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        String str = "모델 : " + this.getModel() + ", 색상: " + this.getColor() + ", 제조회사: " + this.getCompany();
        return str;
    }
    
}
