package ch3.projects;

/**
 * A representation of a balloon
 */
public class Balloon {
    private double radius;

    /**
       Constructs a Balloon with a radius of 0
     */
    public Balloon() {
        this.radius = 0.0;
    }

    /**
     * Constructs a Balloon with a radius of the input provided
     * @param r size of radius
     */
    public Balloon(double r) {
        this.radius = r;
    }

    /**
     * Inflates the balloon by the size of the input
     * @param amount the size to increase the radius
     */
    public void inflate(double amount) {
        this.radius += amount;
    }

    /**
     * Calculates the volume of the balloon using sphere volume formula
     * @return volume of balloon
     */
    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates area of balloon using sphere surface area formula
     * @return the area of the balloon
     */
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Creates a string to display the stats of the balloon: radius, area, volume
     * @return String listing stats of balloon
     */
    @Override
    public String toString() {
        String r = this.radius + "";
        String a = this.getArea() + "";
        String v = this.getVolume() + "";

        return "Radius: " + r + "\nArea: " + a + "\nVolume: " + v;
    }
}
