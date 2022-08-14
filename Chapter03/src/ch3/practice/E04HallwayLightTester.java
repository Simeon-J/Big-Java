package ch3.practice;

public class E04HallwayLightTester {
    public static void main(String[] args) {
        hallwayLight hall = new hallwayLight();
        System.out.println(hall);
        System.out.println();

        hall.toggleFirstSwitch();
        System.out.println(hall);
        System.out.println();

        hall.toggleSecondSwitch();
        System.out.println(hall);
        System.out.println();
    }
}
