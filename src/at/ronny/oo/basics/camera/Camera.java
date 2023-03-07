package at.ronny.oo.basics.camera;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Camera {
    private double pixel;
    private String color;
    private double weight;
    private Customer customer;
    private static resolution resolution;

    private enum resolution {small, medium, large}

    ;
    private List<SDCard> sdCards;
    private Objectiv objectiv;
    private int size;

    public Camera(String color, double weight, Customer customer) {
        this.color = color;
        this.weight = weight;
        this.customer = customer;
        this.sdCards = new ArrayList<>();
    }

    public void takePicture(String name, String resolution) {
        switch (resolution){
            case "4k":
                this.size = 6000;
                break;

            case "2k":
                this.size = 4000;
                break;

            case "Hd":
                this.size = 2000;
        }

        PhotoFile photoFile = new PhotoFile(name, LocalDateTime.now(), this.size);

        for (int i = 0; i < this.sdCards.size(); i++) {
            if (this.sdCards.get(i).getCapacity() <= 6000){
                System.out.println("Der Speicherplatz wird knapp: " + this.sdCards.get(i).getCapacity());
            }

            if (this.sdCards.get(i).getCapacity() > this.size){
                this.sdCards.get(i).savePhotoFiles(photoFile);
                this.sdCards.get(i).setCapacity((this.sdCards.get(i).getCapacity() - this.size));
                System.out.println("Gespeichert auf: " + this.sdCards.get(i).getId());
                break;
            } else if (this.sdCards.get(i).getCapacity() == this.size){
                this.sdCards.get(i).savePhotoFiles(photoFile);
                this.sdCards.get(i).setCapacity((this.sdCards.get(i).getCapacity() - this.size));
                System.out.println("Gespeichert auf: " + this.sdCards.get(i).getId());
                System.out.println("Die SdCard " + this.sdCards.get(i).getId() + " hat nur noch " + this.sdCards.get(i).getCapacity() + " Speicherplatz.");
                if (this.sdCards.size() == 0){
                    System.out.println("Legen Sie für  weitere Aufnahmen eine neue SdCard ein");
                }
                break;
            }
        }

    };

    public void addSdCard(SDCard sdCard) {
            this.sdCards.add(sdCard);
    }

    public void addObjectiv(Objectiv objectiv) {
        this.objectiv = objectiv;
        System.out.println("Das Objectiv mit der Brennweite " + this.objectiv.getFocalLenght() + " wurde der Kamera hinzugefügt");
    }

    public void sdCardInfo(){
        for (int i = 0; i < this.sdCards.size(); i++) {
            this.sdCards.get(i).getInfo();
        }
    }

    public void getSdCardFreeSpace(){
        for (int i = 0; i < this.sdCards.size(); i++) {
            this.sdCards.get(i).getFreeSpace();
        }
    }
}
