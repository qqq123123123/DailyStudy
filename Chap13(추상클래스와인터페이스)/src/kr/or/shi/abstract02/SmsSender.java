package kr.or.shi.abstract02;

public class SmsSender extends ContentSender{

	private String content;
	
	public SmsSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
	public void sendMessage(String recipient)
	{
		System.out.println("제목: " + this.getTitle() + "\n이름: " + this.getName() + "\n내용: " + this.getContent() +
				"\n받는 사람: " + recipient);
	}

}

