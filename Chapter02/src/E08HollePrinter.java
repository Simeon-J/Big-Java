/*
    Write a program HollePrinter that switches the letters "e" and "o" in a string. Use the
    replace method repeatedly. Demonstrate that the string "Hello, World!" turns into
    "Holle, Werld!"
 */

public class E08HollePrinter {

    public static void main(String[] args) {
        var hello = "Hello, World!";
        hello.replace("e", "o");
        System.out.println(hello);
        hello.replace('o', 'e');
        System.out.println(hello);
    }
}
