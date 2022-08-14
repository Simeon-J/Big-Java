package ch3.reinforcements;

/**
 * This class models a tally counter
 */
public class Counter {
    private int value;

    /**
     * Gets current value of this counter
     * @return the current value
     */
    public int getValue() {
        return value;
    }

    /**
     * Advances the value of this counter by 1
     */
    public void click() {
        value++;
    }

    /**
     * Resets the value of this counter to 0
     */
    public void reset() {
        value = 0;
    }
}
