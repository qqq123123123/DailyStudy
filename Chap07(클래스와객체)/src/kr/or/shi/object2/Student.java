package kr.or.shi.object2;

public class Student {

    String name;
    int age;





    //  재정의
    @Override
    public String toString() {
        
        String str = "이름: " + this.name + ", 나이: " + this.age;
        return str;
    }

}
