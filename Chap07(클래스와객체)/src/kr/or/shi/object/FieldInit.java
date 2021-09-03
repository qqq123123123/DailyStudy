package kr.or.shi.object;

public class FieldInit 
{
    byte byteField;         //  1byte
    short shortField;       //  2
    int intField = 22;           //  4
    long longField;         //  8

    boolean booleanField = true;   //  1
    char charField;         //  2

    float floatField;       //  4
    double doubleField;     //  8

    //  참조형 변수
    int[] arrField;         //  4
    String stringField;

    //  toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때, 원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용.

    /*
        this:   객체 자기 자신의 주소.
        super:  조상 객체의 주소
    */
    @Override
    public String toString() {
        String str = "byteField: " + this.byteField + ", ShortField: " + shortField + ", intField: " + intField + ", booleanField: " + booleanField + ", strField: " + stringField; 
        return str;
    }
    
}
