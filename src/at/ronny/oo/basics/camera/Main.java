package at.ronny.oo.basics.camera;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SDCard sd1 = new SDCard(8000, 1234);
        SDCard sd2 = new SDCard(8000, 1248);
        Customer customer = new Customer("Switzerland", "Leica");
        Objectiv objectiv1 = new Objectiv(customer, 1.6);
        Camera camera = new Camera("Darkblue", 125, customer);
        camera.addSdCard(sd1);
        camera.addSdCard(sd2);
        camera.takePicture("Führer", "4k");
        camera.takePicture("Führer2", "4k");
        camera.takePicture("Führer3", "Hd");
        camera.sdCardInfo();
        camera.getSdCardFreeSpace();

    }
}
