package Vehicle;

import java.util.Objects;

/**
 * An abstract class representing a transportation vehicle.
 */
public abstract class TransportationVehicle {

    private String model;
    private double distanceTraveled;
    private int maxPassenger;
    private int maxSpeed;

    /**
     * Constructor for TransportationVehicle.
     * @param model The model of the vehicle.
     * @param maxPassengers The maximum number of passengers the vehicle can carry.
     * @param maxSpeed The maximum speed of the vehicle in miles per hour.
     */
    public TransportationVehicle(String model, int maxPassengers, int maxSpeed) {
        this.model = model;
        this.maxPassenger = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.distanceTraveled = 0.0;
    }

    /**
     * Method to update distance traveled.
     * @param distance The distance to be added to the total distance traveled.
     */
    public void move(double distance) {

        this.distanceTraveled += distance;
    }

    /**
     * Returns the model of the vehicle.
     * @return A string representing the model of the vehicle.
     */
    public String getmodel() {
        return model;
    }

    /**
     * Returns the total distance traveled by the vehicle.
     * @return A double representing the total distance traveled in kilometers.
     */
    public double getDistanceTraveled() {
        return  distanceTraveled;
    }

    /**
     * Returns the maximum number of passengers the vehicle can carry.
     * @return An integer representing the maximum number of passengers.
     */
    public int getMaxPassenger() {
        return maxPassenger;
    }

    /**
     * Returns the maximum speed of the vehicle.
     * @return An integer representing the maximum speed in miles per hour.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Resets the total distance traveled by the vehicle to zero.
     */
    public void resetDistanceTraveled() {
        this.distanceTraveled = 0.0;
    }

    /**
     * Returns a string representation of the vehicle.
     * @return A string representing the vehicle, including its model, total distance traveled, maximum speed, and maximum number of passengers.
     */
    public String toString() {
        return getClass().getSimpleName() + ": model: " + model +
                ", Traveled: " + distanceTraveled + " Km" +
                ", Max speed: " + maxSpeed + " Mph" +
                ", Max passengers: " + maxPassenger;
    }

    /**
     * Compares two TransportationVehicle objects to see if they are equal.
     * @param o The object to be compared to this one.
     * @return A boolean indicating whether the objects are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportationVehicle that = (TransportationVehicle) o;
        return Double.compare(that.distanceTraveled, distanceTraveled) == 0 && maxPassenger == that.maxPassenger && maxSpeed == that.maxSpeed && Objects.equals(model, that.model);
    }

    /**
     * An abstract method that should be implemented in subclasses to return the type of the vehicle.
     * @return A string representing the type of the vehicle.
     */
    public abstract String getType();

}
