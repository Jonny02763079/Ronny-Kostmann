package at.ronny.oo.basics.car;

public class wheel {
    public enum manufacturer{
        Pirelli,
        Haas,
        Mercedes
    }

    private manufacturer manufacturer;
    private int size;
    private int position; //1 vorne rechts, 2 vorne links, 3 hinten rechts, 4 hinten links

    public wheel(wheel.manufacturer manufacturer, int size, int position) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.position = position;
    }

    public wheel.manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(wheel.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
