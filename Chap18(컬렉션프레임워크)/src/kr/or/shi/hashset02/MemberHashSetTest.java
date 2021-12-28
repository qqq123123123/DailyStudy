package kr.or.shi.hashset02;


public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberLee = new Member(1001, "이순신");
        Member memberLee1 = new Member(1002, "이순신2");
        Member memberLee2 = new Member(1003, "이순신3");
        Member memberLee3 = new Member(1004, "이순신4");
        
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberLee1);
        memberHashSet.addMember(memberLee2);
        memberHashSet.addMember(memberLee3);

        memberHashSet.showAllMember();

        memberHashSet.removeMember(memberLee1.getMemberId());
        memberHashSet.showAllMember();

        
    }
}
