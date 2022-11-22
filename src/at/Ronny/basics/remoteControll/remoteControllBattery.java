package remoteControll;

public class remoteControllBattery {
    private int AkkuStatus;
    private int size;
    private int weight;
    private double voltage;

    public remoteControllBattery(int akkuStatus, int size, int weight, double voltage) {
        AkkuStatus = akkuStatus;
        this.size = size;
        this.weight = weight;
        this.voltage = voltage;
    }


    public int getAkkuStatus() {
        return AkkuStatus;
    }

    public void setAkkuStatus(int akkuStatus) {
        AkkuStatus = akkuStatus;
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
