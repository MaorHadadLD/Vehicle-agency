package Vehicle;

enum EnergyScore {
    A,
    B,
    C
}

/**enum PowerSource {
    Manual,
    Automaton,
}*/

/**
 * The NonMotorized interface represents a vehicle that does not have a motor,
 * and defines methods to access and modify the power source and energy score of the vehicle.
 */
public interface NonMotorized {

    /**
     * Sets the power source of the vehicle.
     * @param powerSource a String representing the power source of the vehicle.
     */
    public void setPowerSource(String powerSource);

    /**
     * Gets the power source of the vehicle.
     * @return a String representing the power source of the vehicle.
     */
    public String getPowerSource();

    /**
     * Sets the energy efficiency score of the vehicle.
     * @param energyScore an EnergyScore representing the energy efficiency score of the vehicle.
     */
    public void setEnergyScore(EnergyScore energyScore);

    /**
     * Gets the energy efficiency score of the vehicle.
     * @return an EnergyScore representing the energy efficiency score of the vehicle.
     */
    public EnergyScore getEnergyScore();
}
