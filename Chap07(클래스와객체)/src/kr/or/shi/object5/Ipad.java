package kr.or.shi.object5;

public class Ipad {

    private String compamy;
    private String model;
    private String color;
    private int release;
    
	public String getCompamy() {
		return compamy;
	}
	public void setCompamy(String compamy) {
        if(compamy.equals("Apple"))
        {
		    this.compamy = compamy;
        }
        else
        {
            System.out.println("애플 제조사가 아닙니다.");
            return;
        }
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model.equals("iPad Pro") || model.equals("iPad Air") || model.equals("iPad") || model.equals("iPad Mini"))
        {
            this.model = model;
        }
        else
        {
            System.out.println("애플 제조사 모델이 아닙니다.");
            return;
        }
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}

    @Override
    public String toString() {
        return getRelease() + "년에 출시된" + getCompamy() + "사의 " + getModel() + "입니다.\n 색상은 " + getColor() + "색입니다.";
    }
}
