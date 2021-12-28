package kr.or.shi.hashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class StudentHashMapTest {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(1001, "최지만"), 95);
        map.put(new Student(1001, "최지만"), 90);
        map.put(new Student(1001, "류현진"), 100);
        map.put(new Student(1001, "추신수"), 100);

        System.out.println("총 entry 수: " + map.size());
        System.out.println("최지만: " + map.get(new Student(1001, "최지만")));
        
        Set<Student> keySet = map.keySet();
        Iterator<Student> keyIterator = keySet.iterator();
        while(keyIterator.hasNext())
        {
            Student key = keyIterator.next();
            System.out.println("학번: " + key.getSno() + ", 이름: " + key.getName() + ", 점수: " + map.get(new Student(key.getSno(), key.getName())));
        }
    }
}
