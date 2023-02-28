package at.ronny.oo.basics.iphone;

public class PhotoFile {
    private String extension;
    private int size;
    private String name;

    public PhotoFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void getInfo(){
        System.out.println("Name: " + name + " || Größe: " + size + " || Typ: " + extension);
    }
}
