package Vehicle;
import java.util.Objects;

/**
 * The SpyGlider class represents a type of air transport that is non-motorized and used for spying.
 * It extends the AirTransport class and implements the NonMotorized interface.
 */
public class SpyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private EnergyScore energyScore;

    /**
     * Constructs a new SpyGlider object.
     * @param powerSource a String representing the power source of the glider.
     */
    public SpyGlider(String powerSource) {
        super("classified", 1, 50, "Military");
        this.powerSource = "";
        setEnergyScore(EnergyScore.C);
    }

    /**
     * Sets the power source of the SpyGlider.
     * @param powerSource a String representing the power source of the glider.
     */
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    /**
     * Returns the power source of the SpyGlider.
     * @return a String representing the power source of the glider.
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the energy score of the SpyGlider.
     * @param energyScore an EnergyScore object representing the energy score of the glider.
     */
    public void setEnergyScore(EnergyScore energyScore) {
        this.energyScore = energyScore;
    }

    /**
     * Returns the energy score of the SpyGlider.
     * @return an EnergyScore object representing the energy score of the glider.
     */
    public EnergyScore getEnergyScore() {
        return energyScore;
    }

    /**
     * Returns the type of the SpyGlider as a String.
     * @return a String representing the type of the glider.
     */
    public String getType() {
        return "SpyGlider";
    }

    /**
     * Returns a String representation of the SpyGlider object.
     * @return a String representation of the SpyGlider object.
     */
    public String toString() {
        return getType() + ": " + super.toString() + "Source power: " + getPowerSource() +
                "the energy score is: " + getEnergyScore() + ".";
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o the object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SpyGlider spyGlider = (SpyGlider) o;

        if (!Objects.equals(powerSource, spyGlider.powerSource))
            return false;
        return energyScore == spyGlider.energyScore;
    }
}
