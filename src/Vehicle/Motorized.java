package Vehicle;

/**
 * The Motorized interface defines the behavior of a motorized vehicle.
 * It contains methods for setting and getting the average fuel consumption
 * and the average lifetime of a motorized vehicle.
 */
public interface Motorized {

    /**
     * Sets the average fuel consumption of a motorized vehicle.
     * @param fuelConsumption the average fuel consumption of the vehicle.
     */
    public void setAvgFuelConsumption(int fuelConsumption);

    /**
     * Returns the average fuel consumption of a motorized vehicle.
     * @return the average fuel consumption of the vehicle.
     */
    public int getAverageFuelConsumption();

    /**
     * Sets the average lifetime of a motorized vehicle.
     * @param avgLifetime the average lifetime of the vehicle.
     */
    public void setAvgLifetime(int avgLifetime);

    /**
     * Returns the average lifetime of a motorized vehicle.
     * @return the average lifetime of the vehicle.
     */
    public int getAvgLifetime();
}
