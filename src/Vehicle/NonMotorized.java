package Vehicle;

enum EnergyScore {
    A,
    B,
    C
}

/**enum PowerSource {
    Manual,
    Automaton,
}*/

public interface NonMotorized {

    public void setPowerSource(String powerSource);
    public String getPowerSource();
    public void setEnergyScore(EnergyScore energyScore);
    public EnergyScore getEnergyScore();
}
