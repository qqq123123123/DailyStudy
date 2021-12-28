package kr.or.shi.hashset02;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet()
    {
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size)
    {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member)
    {
        hashSet.add(member);
    }

    public void showAllMember()
    {
        for(Member member : hashSet)
        {
            System.out.println(member);
        }
        System.out.println();
    }

    // public boolean removeMember(int memberId)
    // {
    //     for(int i = 0; i < hashSet.size(); i++)
    //     {
    //         Member member = hashSet.get(i);
    //         int tempId = member.getMemberId();

    //         if(tempId == memberId)
    //         {
    //             hashSet.remove(i);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public boolean removeMember(int memberId)
    {
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext())
        {
            Member member = ir.next();
            int tempId = member.getMemberId();

            if(tempId == memberId)
            {
                hashSet.remove(member);
                return true;
            }
        }

        return false;
    }

    
}
