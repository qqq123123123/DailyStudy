package kr.or.shi.review;

import java.util.*;

public class SearchTest {
    /*
    여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾아보세요.
    단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 수행이 이루어집니다.
    수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 원하는 수를 찾을 수 있습니다.

    정렬된 수 : [12, 23, 31, 49, 54, 66, 70, 87, 95, 108]

    54의 위치를 찾아보세요
    99의 위치를 찾아보세요

    [힌트]
    수가 정렬된 상태이므로 중간의 값을 하나 선택합니다.
    찾으려는 값이 그보다 크면 범위를 오른쪽으로 그보다 작으면 범위를 왼쪽으로 좁힐수 있습니다.
    한번 비교 할때 마다 1/2씩 범위가 좁혀집니다.

    // SearchTest.java

    [출력예시]
    찾는 수는 5번째 있습니다.

    찾는 수가 없습니다.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int[] Arr = new int[]{
            12, 23, 31, 49, 54, 
            66, 70, 87, 95, 108};
        
        int cursor = (Arr.length/2);

        System.out.print("찾는 수를 입력하세요 > ");
        int search = scan.nextInt();

        
        
        // 값이 없다면 어떤 크기의 배열을 넣어도 잘 빠져 나올 수 있는 알고리즘.
        
       
        for(int i = 1; i <= Arr.length / 2; i++)
        {
            if(Arr[cursor] == search)
            {
                System.out.println("찾는 수는 " + (cursor + 1) +"번째에 있습니다.");
                break;
            }
            if(Arr[cursor] > search)
            {
                cursor -= Math.round(Arr.length / (Math.pow(2, i+1)));
            }
            if(Arr[cursor] < search)
            {
                cursor += Math.round(Arr.length / (Math.pow(2, i+1)));
            }
        }

        if(Arr[cursor] != search)
        {
            System.out.println("수가 존재하지 않습니다.");
        }




        // if(search == Arr[cursor])
        // {
        //     System.out.println("찾는 수는 " + (cursor + 1) + "번째에 있습니다.");
        // }
        // if(search > cursor)
        // {
        //     cursor = Arr[(Arr.length/2) + (Arr.length/4)];

        // }
        // else
        // {
        //     temp = Arr[Arr.length/4];
        // }

        
            
        scan.close();
    }
}
