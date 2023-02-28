package at.ronny.oo.basics.iphone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private int actualCapacity;
    private List<PhotoFile> photoFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.photoFiles = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void saveFile(PhotoFile file){
        this.photoFiles.add(file);
    }

    public List<PhotoFile> getPhotoFiles() {
        return photoFiles;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public void gettInfo(){
        for (int i = 0; i < photoFiles.size(); i++) {
            photoFiles.get(i).getInfo();
        }

    }

    public void getFreeSpace(){
        System.out.println("Es sind " + this.actualCapacity + "mb von " + this.capacity + "mb frei");
    }
}
