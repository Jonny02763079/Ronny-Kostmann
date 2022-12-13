package at.ronny.oo.basics.remotecontrol;

public class Battery {
    private double AkkuStatus;
    private int size;
    private int weight;
    private double voltage;

    private double NewAkkuStatus;

    public Battery(double AkkuStatus, int size, int weight, double voltage) {
        this.AkkuStatus = AkkuStatus;
        this.size = size;
        this.weight = weight;
        this.voltage = voltage;
    }

    public double getAkkuStatus() {
        return AkkuStatus;
    }

    public void setAkkuStatus(double AkkuStatus) {
        this.AkkuStatus = AkkuStatus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}
