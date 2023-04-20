package Vehicle;

/**
 * The Commercial interface represents a transportation vehicle that requires a specific license type to operate
 * Implementing classes must provide implementations for the setLicenseType and getLicenseType methods
 */
public interface Commercial {

    /**
     * ets the license type required to operate the transportation vehicle.
     *
     * @param licenseType the license type required to operate the transportation vehicle.
     */
    public void setLicenseType(String licenseType);

    /**
     * Sets the license type required to operate the transportation vehicle.
     *
     * @return the license type required to operate the transportation vehicle.
     */
    public String getLicenseType();
}
