package ch3.practice;

public class RangeInput {
    private int temp;
    private int max;
    private int min;

    /**
     * Constructs a RangeInput object
     * @param max
     * @param min
     */
    public RangeInput(int max, int min) {
        this.max = max;
        this.min = min;
        this.temp = (max + min) / 2;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void up() {
        this.temp++;
        if (this.temp > max)
            this.temp = max;
    }

    public void down() {
        temp--;
        if (temp < min)
            temp = min;
    }

    public int getTemp() {
        return this.temp;
    }
}
