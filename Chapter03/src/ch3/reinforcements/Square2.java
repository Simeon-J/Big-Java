package ch3.reinforcements;

public class Square2 {
    public int sideLength;
    private int area;
    public Square2(int initialLength) {
        sideLength = initialLength;
        area = sideLength * sideLength;
    }
    public int getArea() {
        area = sideLength * sideLength; // area will now update when grow is called
        return area;
    }
    public void grow() {
        sideLength = 2 * sideLength;
    }
}
