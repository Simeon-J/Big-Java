package ch3.practice;

public class E03RangeInputTester {
    public static void main(String[] args) {
        RangeInput range = new RangeInput(80,60);
        for (int i = range.getTemp(); i < range.getMax(); i++) {
            range.up();
            System.out.println(range.getTemp());
        }
    }
}
