package ch3.practice;

public class E13CarTester {
    public static void main(String[] args) {
        Car chevy = new Car(25);
        System.out.println(chevy);
        System.out.println();

        chevy.addGas(100);
        chevy.drive(100);
        System.out.println(chevy);
    }
}
