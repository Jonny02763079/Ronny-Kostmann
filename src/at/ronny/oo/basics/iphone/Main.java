package at.ronny.oo.basics.iphone;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(12345, "06604519064");
        Sim sim1 = new Sim(1589, "06502353179");
        sim.doCall("06601472124");
        SDCard sdCard = new SDCard(1000);
        Camera camera = new Camera(100);
        Phone phone = new Phone("Darkblue", sim1, sdCard, camera);
        System.out.println(phone.getSim().getId());
    }
}
