package kr.or.shi.arraylist02;

/*
    1.  컬렉션 프레임워크
        1)  프로그램 구현에 필요한 자료 구조(Data Structure)를 구현해 놓은 JDK 라이브러리
        2)  java.util 패키지에 구현되어 있음.
        3)  개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음.
        4)  여러 구현 클래스와 인터페이스 활용에 대한 이해가 필요함.

    2.  Collection 인터페이스
        -   하나의 객체를 관리하기 위한 메소드가 선언된 인터페이스
        -   하위에 List와 Set 인터페이스가 있음.

    3.  List 인터페이스
        -   객체를 순서에 따라 저장하고 관리하는데 필요한 메소드가 선언된 인터페이스
        -   자료구조 리스트 (배열, 연결리스트)의 구현을 위한 인터페이스
        -   중복 허용
        -   ArrayList, Vector, LinkedList, Stack, Queue 등

    4.  Set 인터페이스
        -   순서 없음, 중복 불가    ->  유일한 값을 관리하는데 필요한 메소드들을 선언함.(아이디, 주민번호, 사원번호 등..)
        -   입력한 순서대로 출력되지 않을 수 있음.
        -   HashSet, TreeSet 등

    5.  Map 인터페이스
        -   쌍(Pair)으로 이루어진 객체를 관리하는데 사용되는 메소드들이 선언된 인터페이스.
        -   객체는 Key-value 쌍으로 이루어짐.
        -   key는 중복을 허용하지 않음.
        -   HashTable, HashMap, Properties, TreeMap



*/

import java.util.*;

public class ArrayListTest
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //  기본적으로 10개의 공간을 생성.

        System.out.println("총 크기: " + list.size());  //  저장된 객체 갯수 리턴 (0)

        list.add("123");
        list.add("456");
        list.add("123");    //  중복가능
        list.add("333");

        System.out.println("총 크기: " + list.size());  //  저장된 객체 갯수 리턴 (0)
        System.out.println("ArrayList에 있는 값 :" + list.toString());

        list.add(0, "333"); //  0번째 인덱스에 333추가
        System.out.println(list.toString());

        list.remove("333"); //  객체 삭제하기   여러 개 일 경우 가까이 있는 것 1개만 삭제.
        System.out.println(list.toString());
        
        System.out.println("index = " + list.indexOf("333"));   //  저장된 객체의 인덱스 찾아오기 
        System.out.println("index = " + list.indexOf("999"));   //  없으면 -1 리턴

        for(int i = list.size() - 1; i >= 0; i--)   //  리스트 값 삭제  //  꼭 뒤에서부터 시작.
        {
            list.remove(i);
        }

        System.out.println(list.toString());

    }
}