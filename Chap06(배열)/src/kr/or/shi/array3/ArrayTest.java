package kr.or.shi.array3;

public class ArrayTest {
    public static void main(String[] args) {
        String[] province = new String[3];
        System.out.println(province[0]);
        System.out.println(province[1]);
        System.out.println(province[2]);

        province[0] = "경상도";
        province[1] = "전라도";
        province[2] = "강원도";

        System.out.println(province[2]);

        //  charAt() --> 해당 값에 있는 인덱스 --> 한글자 표기용
        String[] strAt = {"hong", "kim", "park"};
        System.out.println(strAt[0].charAt(2));
    }
}
