package kr.or.shi.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println("사이즈: " + set.size());
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        
        System.out.println("사이즈 : " + set.size());

        set.add("JDBC");
        set.add("JSP");
        set.add("Oracle");
        set.add("myBatis");
        set.add(null);
        set.add(null);

        System.out.println("사이즈 : " + set.size());

        //  반복자를 set을 통해서 얻는다.
        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
        {
            String element = iter.next();
            System.out.println(element);
        }

        set.remove("JDBC");
        set.remove("myBatis");

        System.out.println("사이즈 : " + set.size());

        for(String str : set)
        {
            System.out.println(str);
        }
        set.clear();    //  일괄삭제

        System.out.println("사이즈 : " + set.size());
        if(set.isEmpty())                               //  비었는지 확인
        {
            System.out.println("객체가 없습니다.");
        }
        else
        {
            System.out.println("객체가 존재합니다.");
        }
        
    }
}
