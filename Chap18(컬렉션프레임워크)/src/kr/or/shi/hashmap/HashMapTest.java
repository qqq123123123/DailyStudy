package kr.or.shi.hashmap;
import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); //  Key: String, Value: Integer
        System.out.println("사이즈: " + map.size());

        map.put("최지만", 0);
        map.put("류현진", 100);
        map.put("이승엽", 200);
        map.put("최지만2", 300);
        map.put("최지만", 0);           //  중복은 저장하지 않음.   //  중복 저장 시 마지막에 저장된 값으로 대체 됨.
        map.put("이승엽2", 500);


        System.out.println("사이즈: " + map.size());
        System.out.println("값: " + map.get("류현진"));
        System.out.println("값: " + map.get("이승엽"));

        Set<String> set = map.keySet();
        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
        {
            String key = iter.next();
            int value = map.get(key);
            System.out.println(value);
        }
    
        // error 확인바람.
        // Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        // while(entryIterator.hasNext())
        // {
            // Entry<String, Interger> entry = entryIterator;
        // }
    }
}
