package kr.or.shi.staticmethod;

public class MemberTest {
    public static void main(String[] args) {
        Member.sMethod();   //  클래스명.정적멤버명
        Member.cv = 500;
        Member.sMethod();
        //  인스턴스 멤버들을 사용하기 위해서는 반드시 new라는 연산자가 heap에다 인스턴스를 만들어야 사용가능.

        Member member = new Member();
        member.iMethod();
        member.iv = 999;
        member.iMethod();
    }
}
