package kr.or.shi.abstract02;

public class SenderTest {

	public static void main(String[] args) {
		//	추상클래스는 인스턴스를 생성할 수 없다.
		//		ContentSender contentSender = new ContentSender();
		
		ContentSender contentSender = new SmsSender("SMS", "박성강", "네 귀하고 씩씩했던 삶!");
		contentSender.sendMessage("박지선");
		
		ContentSender contentSender2 = new KakaoSender2("카카오톡", "ㄱ김원효", "안녕 해피바이러스!");
		contentSender2.sendMessage("ㅇㅇㅇ");
	}

}
