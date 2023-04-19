package Vehicle;
import java.util.Objects;

public class SpyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private EnergyScore energyScore;

    public SpyGlider(String powerSource) {
        super("classified", 1, 50, "Military");
        this.powerSource = "";
        setEnergyScore(EnergyScore.C);
    }


    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setEnergyScore(EnergyScore energyScore) {
        this.energyScore = energyScore;
    }

    public EnergyScore getEnergyScore() {
        return energyScore;
    }

    public String getType() {
        return "SpyGlider";
    }

    public String toString() {
        return getType() + ": " + super.toString() + "Source power: " + getPowerSource() +
                "the energy score is: " + getEnergyScore() + ".";
    }

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
