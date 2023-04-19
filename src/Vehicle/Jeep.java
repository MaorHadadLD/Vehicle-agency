package Vehicle;

import java.util.Objects;

public class Jeep extends LandTransport implements Motorized, Commercial{

    private String licenseType;
    private int avgFuelConsumption;
    private int avgEngineLife;

    public Jeep(String model, int maxPassengers, int maxSpeed, int avgFuelConsumption, int avgEngineLife) {
        super(model, maxPassengers, maxSpeed, "Dirt");
        this.avgFuelConsumption = avgFuelConsumption;
        this.avgEngineLife = avgEngineLife;
        this.licenseType = "MINI";
    }

    @Override
    public String getType() {
        return "Jeep";
    }

    @Override
    public int getAverageFuelConsumption() {
        return avgFuelConsumption;
    }

    @Override
    public void setAvgFuelConsumption(int fuelConsumption) {
        this.avgFuelConsumption = fuelConsumption;

    }

    @Override
    public int getAvgLifetime() {
        return avgEngineLife;
    }

    @Override
    public void setAvgLifetime(int avgLifetime) {
        this.avgEngineLife = avgLifetime;
    }


    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String toString() {
        return  getType() + "Model: " + getmodel() +
                ", traveled: " + getDistanceTraveled() + " [Km]" +
                ", Max Speed of " + getMaxSpeed() + " [Mph]" +
                ", can get max of " + getMaxPassenger() + " people." +
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
}
