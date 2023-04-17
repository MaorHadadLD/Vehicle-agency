package Vehicle;

public class Frigate extends SeaTransport implements Motorized {

    private double avgFuelConsumption;
    private int avgEngineLife;

    public Frigate(String model, int maxPassengers, int maxSpeed, double avgFuelConsumption, int avgLifetime) {
        super(model, maxPassengers, maxSpeed);
        this.avgFuelConsumption = 500;
        this.avgEngineLife = 4;
        setFlag("State of Israel");
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public int getAvgEngineLife() {
        return avgEngineLife;
    }

    public String getType() {
        return "Frigate";
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption = avgFuelConsumption;

    }

    @Override
    public double getAverageFuelConsumption() {
        return avgFuelConsumption;
    }

    @Override
    public void setAvgLifetime(int avgLifetime) {
        this.avgEngineLife = avgLifetime;

    }

    @Override
    public int getAvgLifetime() {
        return avgEngineLife;
    }
}
