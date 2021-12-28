package kr.or.shi.hashset;

import java.util.Objects;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName)
    {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        
        return this.getMemberName() + "의 ID: " + this.getMemberId();
    }
    @Override
    public int hashCode() {
        System.out.println("hashCode() 호출");
        return Objects.hash(this.memberId, this.memberName);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member)
        {
            Member member = (Member)obj;
            return (member.memberName.equals(this.memberName));
        }
        else return false;
    }
}
