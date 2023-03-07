package at.ronny.oo.basics.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhotoFile> photoFiles;
    private int id;

    public SDCard(int capacity, int id) {
        this.capacity = capacity;
        this.id = id;
        this.photoFiles = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void savePhotoFiles(PhotoFile photoFile){
        this.photoFiles.add(photoFile);
    }

    public int getId() {
        return id;
    }

    public void getInfo(){
        for (int i = 0; i < photoFiles.size(); i++) {
            photoFiles.get(i).getInfo();
        }

    }

    public void getFreeSpace(){
        System.out.println(this.capacity);
    }
}
