package at.ronny.oo.basics.iphone;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int fileSize;
    private static resolution resolution;
    private int photoNumber;
    public  enum resolution {LARGE, SMALL}

    public enum extension {JPG, PNG}
    private static extension extension;
    private List<PhotoFile> photoFiles;

    public Camera() {
        this.photoFiles = new ArrayList<>();
    }

    public PhotoFile makePhoto(resolution size, extension type ) {
        if (size.equals(Camera.resolution.LARGE) && type.equals(Camera.extension.JPG)) {
            PhotoFile file = new PhotoFile("JPG", 10, "Photo " + this.photoNumber);
            System.out.println("Name des Bildes: " + file.getName() + " || Typ des Bildes: " + file.getExtension() + " || Größe des Bildes: " + file.getSize());
            this.photoFiles.add(file);
            this.photoNumber += 1;
            this.fileSize += 10;
            return file;
        } else if (size.equals(Camera.resolution.SMALL) && type.equals(Camera.extension.JPG)) {
            PhotoFile file = new PhotoFile("JPG", 5, "Photo " + this.photoNumber);
            System.out.println("Name des Bildes: " + file.getName() + " || Typ des Bildes: " + file.getExtension() + " || Größe des Bildes: " + file.getSize());
            this.photoFiles.add(file);
            this.photoNumber += 1;
            this.fileSize += 5;
            return file;
        } else if (size.equals(Camera.resolution.LARGE) && type.equals(Camera.extension.PNG)) {
            PhotoFile file = new PhotoFile("PNG", 10, "Photo " + this.photoNumber);
            System.out.println("Name des Bildes: " + file.getName() + " || Typ des Bildes: " + file.getExtension() + " || Größe des Bildes: " + file.getSize());
            this.photoFiles.add(file);
            this.photoNumber += 1;
            this.fileSize += 10;
            return file;
        } else if (size.equals(Camera.resolution.SMALL) && type.equals(Camera.extension.PNG)) {
            PhotoFile file = new PhotoFile("PNG", 5, "Photo " + this.photoNumber);
            System.out.println("Name des Bildes: " + file.getName() + " || Typ des Bildes: " + file.getExtension() + " || Größe des Bildes: " + file.getSize());
            this.photoFiles.add(file);
            this.photoNumber += 1;
            this.fileSize += 5;
            return file;
        }
        return null;
    }

    public List<PhotoFile> getPhotoFiles() {
        return photoFiles;
    }

    public int getFileSize() {
        return fileSize;
    }
}