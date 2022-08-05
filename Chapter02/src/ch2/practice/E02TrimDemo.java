/*
    Look into the API documentation of the String class and locate the trim method.
    Write a program demonstrating what it does. Then show how you can use the
    replace method to remove all spaces from a string.
 */
package ch2.practice;

public class E02TrimDemo {
    public static void main(String[] args) {
        var guy = "                      guy                    ";

        System.out.print("String before applying trim method: ");
        System.out.println(guy);

        System.out.println();

        System.out.print("String after applying trim method: ");
        System.out.println(guy.trim());

        System.out.println();

        System.out.print("Same functionality using replace method: ");
        System.out.println(guy.replace(" ", ""));
    }
}
