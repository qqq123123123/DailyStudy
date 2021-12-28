package kr.or.shi.generic02;

public class TvTest {

	public static void main(String[] args) {
		Tv<String> tv = new Tv<>();
		tv.setE("LG OLED TV");
		
		String tvName = tv.getE();
		System.out.println("나의 Tv는 " + tvName + "입니다.");
		
		
	}

}
