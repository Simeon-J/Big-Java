package ch3.reinforcements;

public class Test {
    public static void main(String[] args) {
        Square2 square = new Square2(10);
        System.out.println(square.sideLength);
        System.out.println(square.getArea());
        square.grow();
        System.out.println(square.sideLength);
        System.out.println(square.getArea());
    }
}
