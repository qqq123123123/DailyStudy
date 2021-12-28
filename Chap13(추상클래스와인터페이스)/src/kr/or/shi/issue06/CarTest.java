package kr.or.shi.issue06;

public class CarTest {
    public static void main(String[] args) {
        Car sonata = new Sonata();
        Car avante = new Avante();
        Car grandeur = new Grandeur();
        Car Genesis = new Genesis();

        sonata.run();
        System.out.println("---------------");
        avante.run();
        System.out.println("---------------");
        grandeur.run();
        System.out.println("---------------");
        Genesis.run();
        System.out.println("---------------");
    }
}
