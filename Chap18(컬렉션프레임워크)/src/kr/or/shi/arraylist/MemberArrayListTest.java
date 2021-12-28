package kr.or.shi.arraylist;

import java.util.Iterator;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(1001, "이순신");
        Member memberLee1 = new Member(1002, "이순신2");
        Member memberLee2 = new Member(1003, "이순신3");
        Member memberLee3 = new Member(1004, "이순신4");
        
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberLee1);
        memberArrayList.addMember(memberLee2);
        memberArrayList.addMember(memberLee3);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberLee1.getMemberId());
        memberArrayList.showAllMember();

        
    }
}
