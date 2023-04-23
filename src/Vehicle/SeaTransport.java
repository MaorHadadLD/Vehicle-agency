package Vehicle;

import java.util.Objects;

/**
 * The SeaTransport abstract class represents a type of transportation vehicle that can be used on sea.
 * It extends the TransportationVehicle class.
 */
public abstract class SeaTransport extends TransportationVehicle {

    /**
     * Indicates whether the sea transport is sailing with or against the wind.
     */
    protected boolean isSailingWithWind;
    /**
     * The flag representing the country of the sea transport.
     */
    protected String countryFlag;

    /**
     * Creates a new SeaTransport object with the given model, maximum number of passengers, maximum speed,
     * sailing direction, and country flag.
     * @param model model The model of the sea transport.
     * @param maxPassengers The maximum number of passengers that the sea transport can carry.
     * @param maxSpeed The maximum speed that the sea transport can travel at.
     * @param isSailingWithWind Indicates whether the sea transport is sailing with or against the wind.
     * @param countryFlag The flag representing the country of the sea transport.
     */
    public SeaTransport(String model, int maxPassengers, int maxSpeed, boolean isSailingWithWind, String countryFlag) {
        super(model, maxPassengers, maxSpeed);
        this.isSailingWithWind = isSailingWithWind() ;
        this.countryFlag = countryFlag;
    }

    /**
     * Returns whether the sea transport is sailing with or against the wind.
     * @return True if the sea transport is sailing with the wind, false otherwise.
     */
    public boolean isSailingWithWind() {
        return isSailingWithWind;
    }

    /**
     * Sets whether the sea transport is sailing with or against the wind.
     * @param isSailingWithWind True if the sea transport is sailing with the wind, false otherwise.
     */
    public void setIsSailingWithWind(boolean isSailingWithWind) {
        this.isSailingWithWind = isSailingWithWind;
    }

    /**
     * Sets the flag representing the country of the sea transport.
     * @param countryFlag The flag representing the country of the sea transport.
     */
    public void setFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    /**
     * Returns the flag representing the country of the sea transport.
     * @return The flag representing the country of the sea transport.
     */
    public String getFlag() {
        return countryFlag;
    }

    /**public String getType() {
        return "Sea";
    }*/

    /**
     * Determines whether two SeaTransport objects are equal based on their fields.
     * @param o The other object to compare to.
     * @return True if the two objects are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SeaTransport that = (SeaTransport) o;

        if (isSailingWithWind != that.isSailingWithWind) return false;
        return Objects.equals(countryFlag, that.countryFlag);
    }

    /**
     * Returns a String representation of the SeaTransport object.
     * @return A String representation of the SeaTransport object.
     */
    public String toString() {
        String result = super.toString() + " Under " + countryFlag + " flag, ";
        result += isSailingWithWind ? "with" : "against";
        return result + " the wind.";
    }
}
