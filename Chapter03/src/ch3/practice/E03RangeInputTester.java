package ch3.practice;

public class E03RangeInputTester {
    public static void main(String[] args) {
        RangeInput range = new RangeInput(60,80);
        for (int i = range.value; i <= range.max; i++) {
            range.up();
            System.out.println(range.getValue());
        }

        for (int i = range.value; i > range.min; i--) {
            range.down();
            System.out.println(range.getValue());
        }
    }
}
