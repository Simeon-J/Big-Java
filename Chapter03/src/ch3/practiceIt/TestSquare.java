package ch3.practiceIt;

public class TestSquare {
    public static void main(String[] args) {
        printSquare(0,3);
    }

    public static void printSquare(int min, int max) {
        int start = min;
        int row = max - min + 1;
        String square = "";
        for (int i = min; i <= max; i++) {
            for (int j = 1; j <= row; j++) {
                if (start == max) {
                    square = square.concat(start + "");
                    start = min;
                } else {
                    square = square.concat(start + "");
                    start++;
                }
            }
            square = square.concat("\n");
            start = i+1;
        }
        System.out.println(square);
    }
}
