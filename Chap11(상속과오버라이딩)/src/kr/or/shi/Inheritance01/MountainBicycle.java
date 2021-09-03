package kr.or.shi.Inheritance01;

/*
    상속을 하는 이유
    1)  공통된 코드는 조상에서 관리
    2)  개별적인 부분은 자손에서 따로 관리
    3)  코드의 재사용성
*/

public class MountainBicycle extends Bicycle{
        
    String frame;
    int gear;
    int price;
    String tire;

    public void print()
    {
        System.out.println("id : " + this.id);
        System.out.println("brand : " + this.brand);
        System.out.println("frame : " + this.frame);
        System.out.println("gear : " + this.gear);
        System.out.println("price : " + this.price);
    }

    public static void main(String[] args) {
        MountainBicycle mBicycle = new MountainBicycle();
        mBicycle.id = 1216;
        mBicycle.brand = "LESPO";
        mBicycle.frame = "알루미늄";
        mBicycle.gear = 33;
        mBicycle.price = 300000;


        mBicycle.print();
    }
}
