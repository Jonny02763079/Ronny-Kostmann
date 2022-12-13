package at.ronny.oo.basics.remotecontrol;

public class Main {

        public static void main(String[] args) {

            Battery b1 = new Battery(100, 5, 100, 3.3);
            Battery b2 = new Battery(90, 5, 100, 3.3);

            remoteControllCase rc1 = new remoteControllCase(10, 300);
            rc1.addBattery(b1);
            rc1.addBattery(b2);
            System.out.println("test");
            System.out.println(b1.getAkkuStatus());
            rc1.getStatus();
            rc1.turnOn();
            b1.setAkkuStatus(50);
            b2.setAkkuStatus(70);
            rc1.getStatus();
            rc1.turnOn();
            rc1.turnOf();
        }


}
