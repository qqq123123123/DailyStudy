package kr.or.shi.staticmethod;

public class Member {
    int iv = 100;           //  인스턴스 멤버변수
    static int cv = 200;    //  static 멤버변수

    //  인스턴스 메소드
    public void iMethod()
    {
        System.out.println("iv: " + iv);
    }
    //  static 메소드
    public static void sMethod()
    {
        System.out.println("cv : " + cv);
    }
}
