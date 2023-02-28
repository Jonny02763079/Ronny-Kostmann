package at.ronny.oo.basics.iphone;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1548, "06604519064");
        SDCard sdCard = new SDCard(64000);
        Camera camera = new Camera();
        Phone phone = new Phone("Darkblue", sim, sdCard, camera);
        phone.makeCall("06601472124");
        phone.takePicure(Camera.resolution.LARGE, Camera.extension.JPG);
        phone.takePicure(Camera.resolution.SMALL, Camera.extension.PNG);
        phone.printAllFiles();
        phone.getFreeSpace();
    }
}
