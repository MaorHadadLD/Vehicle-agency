package Vehicle;

import java.util.Objects;

public abstract class SeaTransport extends TransportationVehicle {

    protected boolean isSailingWithWind;
    protected String countryFlag;

    public SeaTransport(String model, int maxPassengers, int maxSpeed, boolean isSailingWithWind, String countryFlag) {
        super(model, maxPassengers, maxSpeed);
        this.isSailingWithWind = isSailingWithWind() ;
        this.countryFlag = countryFlag;
    }

    public boolean isSailingWithWind() {
        return isSailingWithWind;
    }

    public void setIsSailingWithWind(boolean isSailingWithWind) {
        this.isSailingWithWind = isSailingWithWind;
    }

    public void setFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getFlag() {
        return countryFlag;
    }

    /**public String getType() {
        return "Sea";
    }*/

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SeaTransport that = (SeaTransport) o;

        if (isSailingWithWind != that.isSailingWithWind) return false;
        return Objects.equals(countryFlag, that.countryFlag);
    }

    public String toString() {
        String result = super.toString() + " Under " + countryFlag + " flag, ";
        result += isSailingWithWind ? "with" : "against";
        return result + " the wind.";
    }

}
