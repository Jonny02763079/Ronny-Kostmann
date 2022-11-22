package remoteControll;

public class main {
    public static void main(String[] args) {
        remoteControllBattery b1 = new remoteControllBattery(100, 5, 100, 3.3);
        remoteControllBattery b2 = new remoteControllBattery(90, 5, 100, 3.3);

        remoteControllCase rc1 = new remoteControllCase(10, 300);
        rc1.addBattery(b1);
        rc1.addBattery(b2);
    }
}
