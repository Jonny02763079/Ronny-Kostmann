package at.ronny.oo.basics.iphone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhotoFile> photoFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.photoFiles = new ArrayList<>();
    }
}
