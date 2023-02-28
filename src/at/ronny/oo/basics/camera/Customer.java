package at.ronny.oo.basics.camera;

public class Customer {
    private String country;
    private String name;

    public Customer(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
