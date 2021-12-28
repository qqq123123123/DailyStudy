package kr.or.shi.abstract02;

public abstract class KakaoSender extends ContentSender{
	private String content;
	
	public KakaoSender(String title, String name, String content)
	{
		super(title, name);
		this.content = content;
	}
	
	public void sendMessage(String content)
	{
		
	}

}
