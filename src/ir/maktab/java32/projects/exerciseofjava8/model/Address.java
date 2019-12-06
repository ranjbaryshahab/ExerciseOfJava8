package ir.maktab.java32.projects.exerciseofjava8.model;

public class Address {
    private String city;
    private Integer zone;
    private String street;
    private String ally;
    private String postalCode;

    public Address(String city, int zone, String street, String ally, String postalCode) {
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.ally = ally;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAlly() {
        return ally;
    }

    public void setAlly(String ally) {
        this.ally = ally;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zone='" + zone + '\'' +
                ", street='" + street + '\'' +
                ", ally='" + ally + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
