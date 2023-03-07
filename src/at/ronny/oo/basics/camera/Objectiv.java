package at.ronny.oo.basics.camera;

public class Objectiv {
    private Customer customer;
    private double focalLenght;

    public Objectiv(Customer customer, double focalLenght) {
        this.customer = customer;
        this.focalLenght = focalLenght;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getFocalLenght() {
        return focalLenght;
    }
}
