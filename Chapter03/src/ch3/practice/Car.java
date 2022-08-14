package ch3.practice;

/**
 * Car
 */
public class Car {
    public int mpg;
    public int gas;
    public int miles;

    /**
     * Constructs a new car with a set fuel efficiency and no gass
     * @param milesPerGallon fuel efficiency in miles/gallon
     */
    public Car(int milesPerGallon) {
        mpg = milesPerGallon;
        gas = 0;
    }

    /**
     * Drives the car the given distance and calculates fuel consumption
     * @param miles miles car has driven
     */
    public void drive(int miles) {
        gas -= miles / mpg;
    }

    /**
     * Returns amount of gas in tank
     * @return gas in tank in gallons
     */
    public int getGasInTank() {
        return gas;
    }

    /**
     * Adds gas to car
     * @param gallon gas to add in gallons
     */
    public void addGas(int gallon) {
        gas += gallon;
    }

    /**
     * Returns string displaying stats of car
     * @return string representation of car
     */
    public String toString() {
        return "Fuel efficiency: " + mpg + "\nGas in tank: " + gas + "\nMiles driven: " + miles;
    }
}
