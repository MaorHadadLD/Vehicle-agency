package Vehicle;

public class ToyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private char energyScore;

    public ToyGlider(String model, int maxSpeed) {
        super(model, 0, 10);
        this.powerSource = "manual";
        this.energyScore = 'A';
    }


    @Override
    public String getLicenseType() {
        return null;
    }

    @Override
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;

    }

    @Override
    public String getPowerSource() {
        return powerSource;
    }

    @Override
    public void setEnergyScore(String energyScore) {
        this.energyScore = energyScore.charAt(0);

    }

    @Override
    public char getEnergyScore() {
        return energyScore;
    }
}
