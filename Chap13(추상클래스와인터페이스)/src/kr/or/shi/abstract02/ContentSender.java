package kr.or.shi.abstract02;

/*
    추상클래스: 1개 이상의 추상 메소드를 포함하는 클래스
*/

public abstract class ContentSender {
    private String title;
    private String name;
    public ContentSender(String title, String name) {
        super();
        this.title = title;
        this.name = name;
    }
    public String getTitle()
    {
        return title;
    }
    public String getName()
    {
        return name;
    }

    //  추상메소드: 상속을 통해서 반드시 재정의 되어야 인스턴스 생성 가능함.
    public abstract void sendMessage(String content);

}
