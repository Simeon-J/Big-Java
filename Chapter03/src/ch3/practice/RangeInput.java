package ch3.practice;

/**
 * Creates a value between a range of numbers that can be manipulated
 */
public class RangeInput {
    public int min;
    public int max;
    public int value;

    /**
     * Creates a range. initial value is average of ranges
     * @param min lower bound of range
     * @param max upper bound of range
     */
    public RangeInput(int min, int max) {
        this.min = min;
        this.max = max;
        value = (min + max) / 2;
    }

    /**
     * Increases value by 1, but no higher than min
     */
    public void up() {
        if (Math.min(value, max-1) == value)
            value++;
    }

    /**
     * Decreases value by 1, but no lower than min
     */
    public void down() {
        if (Math.max(value, min+1) == value)
            value--;
    }

    /**
     * Returns the current value
     * @return current value
     */
    public int getValue() {
        return value;
    }
}
