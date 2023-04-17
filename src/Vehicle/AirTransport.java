package Vehicle;

public abstract class AirTransport extends TransportationVehicle implements Commercial{

    private boolean isMilitary;
    private String licenseType;

    public AirTransport(String model, int maxPassengers, int maxSpeed) {
        super(model, maxPassengers, maxSpeed);
        this.isMilitary = false;
        this.licenseType = "";
    }

    public void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getType() {
        return "Air";
    }
}
