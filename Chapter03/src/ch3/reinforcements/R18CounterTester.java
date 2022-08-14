package ch3.reinforcements;

public class R18CounterTester {
    public static void main(String[] args) {
        Counter count = new Counter();
        count.click();
        count.click();
        System.out.println("Expected: 2");
        System.out.println(count.getValue());
        count.reset();
        System.out.println("Expected: 0");
        System.out.println(count.getValue());
    }
}
