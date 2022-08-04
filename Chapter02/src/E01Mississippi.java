/*
    Write a program that initializes a string with "Mississippi". Then replace all "i" with
    "ii" and print the length of the resulting string. In that string, replace all "ss" with "s"
    and print the length of the resulting string
 */

public class E01Mississippi {

    public static void main(String[] args) {
        var a = "Mississippi";
        var i = a.replace("i","ii");
        System.out.println("a: " + i + " Length: " + i.length());

        var s = i.replace("ss", "s");
        System.out.print("a: " + s + " Length: " + s.length());
    }
}
