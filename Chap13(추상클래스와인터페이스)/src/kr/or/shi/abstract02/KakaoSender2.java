package kr.or.shi.abstract02;

public class KakaoSender2 extends ContentSender{
	private String content;
	
	public KakaoSender2(String title, String name, String content)
	{
		super(title, name);
		this.content = content;
	}
	
	
	public String getContent()
	{
		return this.content;
	}
	
	public void sendMessage(String recipient)
	{
		System.out.println("제목2: " + this.getTitle() + "\n이름2: " + this.getName() + "\n내용2: " + this.getContent() +
				"\n받는 사람2: " + recipient);
	}

}
