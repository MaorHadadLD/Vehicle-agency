package Vehicle;

public  class SeaTransport extends TransportationVehicle {

    private boolean isSailingWithWind;
    private String countryFlag;

    public SeaTransport(String model, int maxPassengers, int maxSpeed) {
        super(model, maxPassengers, maxSpeed);
        this.isSailingWithWind = false;
        this.countryFlag = "";
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

    public String getType() {
        return "Sea";
    }

}
