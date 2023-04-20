package Vehicle;

/**

 The Frigate class represents a type of sea transport that is motorized.
 It inherits from the SeaTransport class and implements the Motorized interface.
 */
public class Frigate extends SeaTransport implements Motorized {

    private int avgFuelConsumption;
    private int avgEngineLife;

    /**
     * Constructs a new Frigate object with the specified model, maximum number of passengers,
     * maximum speed, and whether it sails with the wind or not.
     *
     * @param model the model of the frigate
     * @param maxPassengers the maximum number of passengers the frigate can carry
     * @param maxSpeed the maximum speed of the frigate
     * @param isSailingWithWind true if the frigate sails with the wind, false otherwise
     */
    public Frigate(String model, int maxPassengers, int maxSpeed, boolean isSailingWithWind) {
        super(model, maxPassengers, maxSpeed, isSailingWithWind, "Israel");
        setAvgFuelConsumption(500);
        setAvgLifetime(4);
    }

    /**
     * Returns the average fuel consumption of the frigate.
     *
     * @return the average fuel consumption of the frigate
     */
    public int getAverageFuelConsumption() {
        return avgFuelConsumption;
    }

    /**
     * Sets the average fuel consumption of the frigate to the specified value.
     *
     * @param fuelConsumption the new average fuel consumption of the frigate
     */
    public void setAvgFuelConsumption(int fuelConsumption) {
        avgFuelConsumption = fuelConsumption;
    }

    /**
     * Returns the average lifetime of the frigate's engine.
     *
     * @return the average lifetime of the frigate's engine
     */
    public int getAvgLifetime() {
        return avgEngineLife;
    }

    /**
     * Sets the average lifetime of the frigate's engine to the specified value.
     *
     * @param avgLifetime the new average lifetime of the frigate's engine
     */
    public void setAvgLifetime(int avgLifetime) {
        avgEngineLife = avgLifetime;
    }

    /**
     * Returns the type of the frigate.
     *
     * @return the type of the frigate
     */
    public String getType() {
        return "Frigate";
    }

    /**
     * Returns a string representation of the frigate, which includes its type, model, maximum number of passengers,
     * maximum speed, whether it sails with the wind or not, average fuel consumption, and average engine lifetime.
     *
     * @return a string representation of the frigate
     */
    public String toString() {
        return getType() + ": " + super.toString() + "engine: " + getAverageFuelConsumption() +
                "liter, life time of the engine " + getAvgLifetime() + "years.";
    }

    /**
     * Returns true if the frigate is equal to the specified object, and false otherwise.
     * Two frigates are considered equal if they have the same model, maximum number of passengers,
     * maximum speed, whether they sail with the wind or not, average fuel consumption, and average engine lifetime.
     *
     * @param o the object to compare with the frigate
     * @return true if the frigate is equal to the specified object, and false otherwise
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Frigate frigate = (Frigate) o;
        if(Float.compare(frigate.avgFuelConsumption, avgFuelConsumption) != 0) return false;
        return avgEngineLife == frigate.avgEngineLife;
    }
}
