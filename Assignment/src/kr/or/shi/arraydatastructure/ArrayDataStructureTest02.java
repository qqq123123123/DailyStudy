package kr.or.shi.arraydatastructure;

public class ArrayDataStructureTest02 {
    public static void main(String[] args) {
        Integer[][] dataList = {{1,2,3}, {4,5,6}};
        //  데이터 2를 인덱스로 지정해서 출력해보시오.
        System.out.println(dataList[0][1]);
        System.out.println(dataList[1][1]);

        Integer[][][] dataList2 =
        {
            {   {1, 2, 3},
                {4, 5, 6},
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
            
        };

        System.out.println(dataList2[0][1][1]);
        System.out.println(dataList2[1][1][2]);
        System.out.println(dataList2[1][0][1] + " " + dataList2[1][1][0] + " " + dataList2[0][0][1]);
    }
    
}
