package Vehicle;

public class Frigate extends SeaTransport implements Motorized {

    private int avgFuelConsumption;
    private int avgEngineLife;

    public Frigate(String model, int maxPassengers, int maxSpeed, boolean isSailingWithWind) {
        super(model, maxPassengers, maxSpeed, isSailingWithWind, "Israel");
        setAvgFuelConsumption(500);
        setAvgLifetime(4);
    }

    public int getAverageFuelConsumption() {
        return avgFuelConsumption;
    }

    public void setAvgFuelConsumption(int fuelConsumption) {
        avgFuelConsumption = fuelConsumption;
    }

    public int getAvgLifetime() {
        return avgEngineLife;
    }

    public void setAvgLifetime(int avgLifetime) {
        avgEngineLife = avgLifetime;
    }

    public String getType() {
        return "Frigate";
    }



    public String toString() {
        return getType() + ": " + super.toString() + "engine: " + getAverageFuelConsumption() +
                "liter, life time of the engine " + getAvgLifetime() + "years.";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Frigate frigate = (Frigate) o;
        if(Float.compare(frigate.avgFuelConsumption, avgFuelConsumption) != 0) return false;
        return avgEngineLife == frigate.avgEngineLife;
    }

}
