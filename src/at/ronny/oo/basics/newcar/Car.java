package at.ronny.oo.basics.newcar;

public class Car {
    private String color;
    private double vMax;
    private double price;
    private double conusmption;
    private Engine engine;
    private Producer producer;
    private double mileage;

    public Car(String color, double vMax, double price, double conusmption) {
        this.color = color;
        this.vMax = vMax;
        this.price = price;
        this.conusmption = conusmption;
    }

    public void addEngine(Engine engine){
        this.engine = engine;
    }

    public void addProducer(Producer producer){
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public double getvMax() {
        return vMax;
    }

    public double getPrice() {
        return price;
    }

    public double getConusmption() {
        return conusmption;
    }

    public Engine getEngine() {
        return engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
        if(this.mileage >= 50000){
            this.conusmption *= 1.098;
        }
    }
}
