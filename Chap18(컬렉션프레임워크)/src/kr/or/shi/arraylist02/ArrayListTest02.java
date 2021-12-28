package kr.or.shi.arraylist02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    ArrayList
        -   객체 배열 클래스
        -   Vector는 자바2부터 제공된 클래스.
        -   일반적으로 ArrayList를 더 많이 사용
        -   Vector는 멀티 스레드 프로그램에서 동기화
        -   동기화(synchronize) :   두 개의 쓰레드가 동시에 하나의 리소스에 접근할 때 
                                    순서를 맞춰 접근함으로써 데이터의 오류가 일어나지 않도록함.
*/

/*
    1. 113점 들었는데 7점만 듣다가 하나 F나면 계절학기로 채우면 졸업가능한지?
    2. 막학기에 출석F가 없다는데 미리 교수님한테 말해야 하는지?
    3. 대학생활 포폴?   그 외 할거있는지?
*/

public class ArrayListTest02 {

    public static void print(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        System.out.println("list1: " + list1.toString());
        System.out.println("list2: " + list2.toString());
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));   //  마지막 인덱스를 포함하지않고 List타입으로 리턴함
        print(list1, list2);

        Collections.sort(list1);    //  정렬은 기본적으로 오름차순으로 됨.
        print(list1, list2);

        System.out.println("list1 컬렉션에 list2 컬렉션의 모든 요소가 들어있느냐?");    //  포함관계
        System.out.println(list1.containsAll(list2));
        System.out.println();

        list2.add("B");
        list2.add("C");
        System.out.println(list2.toString());

        list2.add(3, 333);
        System.out.println(list2.toString());

        list2.set(3, 999);  //  대체하기
        System.out.println(list2.toString());
        
        for(int i = list2.size() - 1; i >=0; i--)
        {
            if(list1.contains(list2.get(i)))
            {
                list2.remove(i);
            }
        }

        print(list1,list2);
        
    }
}
