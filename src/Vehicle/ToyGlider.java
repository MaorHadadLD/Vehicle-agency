package Vehicle;

import java.util.Objects;

/**
 * The ToyGlider class represents a non-motorized air transport vehicle, specifically a toy glider.
 * It extends the AirTransport class and implements the NonMotorized interface.
 */
public class ToyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private EnergyScore energyScore;

    /**
     * Constructor for ToyGlider class.
     * It calls the constructor of AirTransport class with default parameters,
     * sets the power source to "manual", and sets the energy score to "A".
     */
    public ToyGlider() {
        super("Toy", 0, 10, "civilian");
        setPowerSource("manual") ;
        setEnergyScore(EnergyScore.A);
    }

    /**
     * Sets the power source of the toy glider.
     * @param powerSource a string representing the power source of the toy glider
     */
    @Override
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;

    }

    /**
     * Returns the power source of the toy glider.
     * @return a string representing the power source of the toy glider.
     */
    @Override
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the energy score of the toy glider.
     * @param energyScore an EnergyScore enum representing the energy score of the toy glider
     */
    @Override
    public void setEnergyScore(EnergyScore energyScore) {
        this.energyScore = energyScore;
    }

    /**
     * Returns the energy score of the toy glider.
     * @return an EnergyScore enum representing the energy score of the toy glider.
     */
    @Override
    public EnergyScore getEnergyScore() {
        return energyScore;
    }

    /**
     * Returns the type of the toy glider as a string.
     * @return a string representing the type of the toy glider.
     */
    public String getType() {
        return "ToyGilder";
    }

    /**
     * Returns a string representation of the toy glider object.
     * @return a string representing the toy glider object
     */
    public String toString() {
        return getType() + ": " + super.toString() + "Source power: " + getPowerSource() +
                "the energy score is: " + getEnergyScore() + ".";
    }

    /**
     * Checks whether this toy glider object is equal to another object.
     * Two toy gliders are considered equal if they have the same power source and energy score,
     * and their super class (AirTransport) is equal.
     * @param o the object to compare this toy glider with
     * @return true if the objects are equal, false otherwise
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ToyGlider toyGlider = (ToyGlider) o;

        if (!Objects.equals(powerSource, toyGlider.powerSource))
            return false;
        return energyScore == toyGlider.energyScore;
    }
}
