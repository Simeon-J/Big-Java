package ch3.practice;

/**
 * Simulates the circuit for a hallway light with two switches
 */
public class hallwayLight {
    private int firstSwitch;
    private int secondSwitch;
    private int lamp;

    /**
     * Constructs a hallway light that is off with both switches down
     */
    public hallwayLight() {
        firstSwitch = 0;
        secondSwitch = 0;
        lamp = 0;
    }

    /**
     * Returns state of first switch: 1 for up, 0 for down
     * @return state of first switch
     */
    public int getFirstSwitchState() {
        return firstSwitch;
    }

    /**
     * Returns state of second switch: 1 for up, 0 for down
     * @return state of second switch
     */
    public int getSecondSwitchState() {
        return secondSwitch;
    }

    /**
     * Returns state of hallway light: 1 for on, 0 for off
     * @return state of hallway light switch
     */
    public int getLampState() {
        return lamp;
    }

    /**
     * Changes the state of the hallway light and first switch
     */
    public void toggleFirstSwitch() {
        if (firstSwitch == 0)
            firstSwitch = 1;
        else
            firstSwitch = 0;

        if (lamp == 0)
            lamp = 1;
        else
            lamp = 0;
    }

    /**
     * Changes the state of the hallway light and second switch
     */
    public void toggleSecondSwitch() {
        if (secondSwitch == 0)
            secondSwitch = 1;
        else
            secondSwitch = 0;

        if (lamp == 0)
            lamp = 1;
        else
            lamp = 0;
    }

    public String toString() {
        String s1 = firstSwitch + "";
        String s2 = secondSwitch + "";
        String l1 = lamp + "";

        return "Lamp state: " + l1 + "\nFirst Switch: " + s1 + "\nSecond Switch: " + s2;
    }
}
