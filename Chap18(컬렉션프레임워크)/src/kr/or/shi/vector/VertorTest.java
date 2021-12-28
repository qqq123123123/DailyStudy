package kr.or.shi.vector;

import java.util.Vector;

public class VertorTest {
    
    public static void main(String[] args) { 
    Vector<Board> vector = new Vector<>(5);
    
    System.out.println("용량: " + vector.capacity());
    System.out.println("초기 사이즈: " + vector.size());
    System.out.println("----");
    
    vector.add(new Board("제목1", "내용1", "글쓴이1"));
    vector.add(new Board("제목2", "내용1", "글쓴이1"));
    vector.add(new Board("제목3", "내용1", "글쓴이1"));
    vector.add(new Board("제목4", "내용1", "글쓴이1"));
    vector.add(new Board("제목5", "내용1", "글쓴이1"));

    
    System.out.println("객체 추가 후 용량: " + vector.capacity());
    System.out.println("객체 추가 후 사이즈: " + vector.size());
    System.out.println("----");

    vector.setSize(3);
    System.out.println("객체 추가 후 용량: " + vector.capacity());
    System.out.println("객체 추가 후 사이즈: " + vector.size());
    System.out.println("----");

    
    
    

    }
    
}
