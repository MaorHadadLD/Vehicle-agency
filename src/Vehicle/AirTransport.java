package Vehicle;

import java.util.Objects;

public abstract class AirTransport extends TransportationVehicle{

    private String usefor;


    public AirTransport(String model, int maxPassengers, int maxSpeed, String use) {
        super(model, maxPassengers, maxSpeed);
        this.usefor = use;
    }

    public String getUsefor() {
        return usefor;
    }

    public void setUsefor(String usefor) {
        this.usefor = usefor;
    }

   public String getType() {
        return "Air";
    }

    public String toString() {
        return super.toString() + " The use is made for the benefit of the " + usefor + ",";
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        AirTransport airTransport = (AirTransport) o;
        return Objects.equals(usefor, airTransport.usefor);
    }


}
