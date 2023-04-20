package Vehicle;

import java.util.Objects;

/**

 The AirTransport class is an abstract class that extends the TransportationVehicle class and represents any type of
 transportation that can fly in the air.
 @author [Your Name]
 @version [The date you last modified the code]
 */
public abstract class AirTransport extends TransportationVehicle{

    /**
     * the purpose of the AirTransport.
     */
    private String useFor;

    /**
     * Creat an instance of AirTransport with the given model, maximum number of passengers, maximum speed and use
     *
     * @param model the model of the air transport
     * @param maxPassengers the maximum number of passengers that the air transport can hold.
     * @param maxSpeed the maximum speed that the air transport can reach.
     * @param use the purpose of the air transport.
     */
    public AirTransport(String model, int maxPassengers, int maxSpeed, String use) {
        super(model, maxPassengers, maxSpeed);
        this.useFor = use;
    }

    /**
     * Return the purpose of the air transport.
     * @return the purpose of the air transport.
     */
    public String getUseFor() {
        return useFor;
    }

    /**
     * Sets the purpose of the air transport.
     * @param useFor the purpose of the air transport.
     */
    public void setUseFor(String useFor) {
        this.useFor = useFor;
    }

   /**public String getType() {
        return "Air";
    }*/

    /**
     * Return a string representation of the AirTransport object, including it's model, maximum number of passengers,
     * maximum speed and the purpose.
     * @return a string representation of the AirTransport object.
     */
    public String toString() {
        return super.toString() + " The use is made for the benefit of the " + useFor + ",";
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise
     */
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        AirTransport airTransport = (AirTransport) o;
        return Objects.equals(useFor, airTransport.useFor);
    }
}
