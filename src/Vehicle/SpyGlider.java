package Vehicle;

public class SpyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private char energyScore;

    public SpyGlider(String maxSpeed, int energyScore) {
        super("classified", 1, 50);
        this.powerSource = "Non-motorized";
        this.energyScore = (char) energyScore;
        setLicenseType("C");
        setIsMilitary(true);
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setEnergyScore(String energyScore) {
        this.energyScore = energyScore.charAt(0);
    }

    public char getEnergyScore() {
        return energyScore;
    }

    public void setAvgFuelConsumption(double avgFuelConsumption) {
        // No fuel consumption for non-motorized vehicles
    }

    public double getAverageFuelConsumption() {
        return 0;
    }

    public void setAvgLifetime(int avgLifetime) {
        // No engine life for non-motorized vehicles
    }

    public int getAvgLifetime() {
        return 0;
    }


    @Override
    public String getLicenseType() {
        return null;
    }
}
