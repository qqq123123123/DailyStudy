package kr.or.shi.hashset;

import java.util.HashSet;

public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();

        set.add(new Member(30, "최지만"));
        set.add(new Member(30, "최지만"));
        set.add(new Member(25, "최지만"));
        set.add(new Member(17, "최지만"));

        System.out.println("총 객체수 : " + set.size());
        
    }
}
