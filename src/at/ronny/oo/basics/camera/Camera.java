package at.ronny.oo.basics.camera;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private double pixel;
    private String color;
    private double weight;
    private Customer customer;
    private static resolution resolution;
    private enum resolution {small, medium, large};
    private List<SDCard> sdCards;
    private Objectiv objectiv;
    private double size;
    private List<PhotoFile> photoFiles;

    public Camera(double pixel, String color, double weight, Customer customer) {
        this.pixel = pixel;
        this.color = color;
        this.weight = weight;
        this.customer = customer;
        this.sdCards = new ArrayList<>();
        this.photoFiles = new ArrayList<>();
    }

    public PhotoFile takePicture(String resolution){
        if (resolution.equals("4k")){
            this.pixel = 8294400;
            this.resolution = Camera.resolution.large;
            this.size = 2000;

        }
        return null;
    }
}
