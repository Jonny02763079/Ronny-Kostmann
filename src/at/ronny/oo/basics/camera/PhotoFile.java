package at.ronny.oo.basics.camera;

import java.time.LocalDateTime;

public class PhotoFile {
    private String name;
    private LocalDateTime date;
    private double size;

    public PhotoFile(String name, LocalDateTime date, double size) {
        this.name = name;
        this.date = LocalDateTime.now();;
        this.size = size;
    }

    public void getInfo(){
        System.out.println("Name des Bildes: " + name + " Datum der Aufnahme: " + date + " Größe der Aufnahme: " + size);
    }
}
