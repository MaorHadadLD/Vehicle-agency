package Vehicle;

import java.util.Objects;

public class Jeep extends LandTransport implements Motorized, Commercial {

    private String licenseType;
    private double avgFuelConsumption;
    private int avgEngineLife;

    public Jeep(String model, int maxPassengers, int maxSpeed, double avgFuelConsumption, int avgEngineLife) {
        super(model, maxPassengers, maxSpeed, "Dirt");
        this.avgFuelConsumption = avgFuelConsumption;
        this.avgEngineLife = avgEngineLife;
        this.licenseType = "MINI";
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public int getAvgEngineLife() {
        return avgEngineLife;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String toString() {
        return "Jeep: Model: " + getmodel() +
                ", traveled: " + getDistanceTraveled() + " [Km]" +
                ", Max Speed of " + getMaxSpeed() + " [Mph]" +
                ", can cerry max of " + getMaxPassenger() + " people." +
                " Commercial license: " + licenseType +
                ", Avg Fuel Consumption: " + avgFuelConsumption +
                ", Avg Engine Life: " + avgEngineLife + " rears.";
    }

    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Jeep jeep = (Jeep) o;
        return Double.compare(jeep.avgFuelConsumption, avgFuelConsumption) == 0 &&
                avgEngineLife == jeep.avgEngineLife &&
                Objects.equals(licenseType, jeep.licenseType);

    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {

    }

    @Override
    public double getAverageFuelConsumption() {
        return 0;
    }

    @Override
    public void setAvgLifetime(int avgLifetime) {

    }

    @Override
    public int getAvgLifetime() {
        return 0;
    }

    @Override
    public void setPowerSource(String powerSource) {

    }

    @Override
    public String getPowerSource() {
        return null;
    }

    @Override
    public void setEnergyScore(String energyScore) {

    }

    @Override
    public char getEnergyScore() {
        return 0;
    }
}
