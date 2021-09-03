package kr.or.shi.object2;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.age = 20;
        stu1.name = "최자";

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println();

        //  stu1의 주소를 stu2에 대입.
        //  원래 stu2가 가리키고 있던 인스턴스는 쓰레기 객체가 되며 garbage collector에서 소멸 시킴.
        stu2 = stu1;
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println();

        stu2.age = 10;
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
