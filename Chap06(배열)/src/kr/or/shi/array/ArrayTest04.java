package kr.or.shi.array;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for(int i = 0, num = 1; i < arr.length; i++, num++)
        {
            arr[i] = num;
        }
        for(int i = 0; i < arr.length; i++)
        {
            total += arr[i];
        }

        System.out.println(total);
        double[] dArr = new double[5];
        dArr[0] = 1.1; 
        dArr[1] = 2.1; 
        dArr[2] = 3.1;
    }
}
