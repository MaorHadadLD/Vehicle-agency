package Vehicle;

import java.util.Objects;

public abstract class TransportationVehicle {

    private String model;
    private double distanceTraveled;
    private int maxPassenger;
    private int maxSpeed;

    //constructor
    public TransportationVehicle(String model, int maxPassengers, int maxSpeed) {
        this.model = model;
        this.maxPassenger = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.distanceTraveled = 0.0;
    }

    //method to update distance traveled
    public void move(double distance) {

        this.distanceTraveled += distance;
    }

    public String getmodel() {
        return model;
    }

    public double getDistanceTraveled() {
        return  distanceTraveled;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void resetDistanceTraveled() {
        this.distanceTraveled = 0.0;
    }

    public String toString() {
        return getClass().getSimpleName() + ": model: " + model +
                ", Traveled: " + distanceTraveled + " Km" +
                ", Max speed: " + maxSpeed + " Mph" +
                ", Max passengers: " + maxPassenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportationVehicle that = (TransportationVehicle) o;
        return Double.compare(that.distanceTraveled, distanceTraveled) == 0 && maxPassenger == that.maxPassenger && maxSpeed == that.maxSpeed && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, distanceTraveled, maxPassenger, maxSpeed);
    }

    //abstract methods
    public abstract String getType();

}
