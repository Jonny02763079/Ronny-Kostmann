package at.ronny.oo.basics.lamp;

public class GlowElements {
    private String name;
    private String color;
    private double ampereconsumption;
    public enum STATUS {On, Off};
    private STATUS onOffStatus;
    private boolean isOn;

    private double sum = 0;

    public GlowElements(String name, String color, double ampereconsumption, STATUS onOffStatus) {
        this.name = name;
        this.color = color;
        this.ampereconsumption = ampereconsumption;
        this.onOffStatus = onOffStatus;
        this.isOn = false;
    }

    public void turnOn(){
        if(!isOn){
            System.out.println("Sie haben das Glühelement " + this.name + " eingeschalten");
            isOn = true;
            this.sum = this.ampereconsumption *= 1.05;
            System.out.println(this.sum);
        } else {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschalten");
            isOn = true;
        }
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Die Lampe " + this.name + " ist nun ausgeschalten");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAmpereconsumption() {
        return ampereconsumption;
    }

    public void setAmpereconsumption(double ampereconsumption) {
        this.ampereconsumption = ampereconsumption;
    }

    public STATUS getOnOffStatus() {
        return onOffStatus;
    }

    public void setOnOffStatus(STATUS onOffStatus) {
        this.onOffStatus = onOffStatus;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

}
