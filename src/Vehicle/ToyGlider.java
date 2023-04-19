package Vehicle;

import java.util.Objects;

public class ToyGlider extends AirTransport implements NonMotorized{

    private String powerSource;
    private EnergyScore energyScore;

    public ToyGlider() {
        super("Toy", 0, 10, "civilian");
        setPowerSource("manual") ;
        setEnergyScore(EnergyScore.A);
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
    public void setEnergyScore(EnergyScore energyScore) {
        this.energyScore = energyScore;
    }

    @Override
    public EnergyScore getEnergyScore() {
        return energyScore;
    }

    public String toString() {
        return getType() + ": " + super.toString() + "Source power: " + getPowerSource() +
                "the energy score is: " + getEnergyScore() + ".";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ToyGlider toyGlider = (ToyGlider) o;

        if (!Objects.equals(powerSource, toyGlider.powerSource))
            return false;
        return energyScore == toyGlider.energyScore;
    }
}
