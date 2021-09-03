package kr.or.shi.staticvariable;

public class Card {
    
	private String color;
    private String company;

    static int width = 100;
    static int height = 50;


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
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		Card.width = width;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		Card.height = height;
	}

	@Override
	public String toString() {
		return "card1의 색상: " + this.getColor()+ ", card1의 회사: " + this.getCompany() + ", 크기: " + +Card.height + ",  " + Card.width;
	}
}
