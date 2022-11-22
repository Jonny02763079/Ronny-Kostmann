package at.Ronny.oo.basics.car;

public class Rueckspiegel {
    private int size;
    private int position; //0 neutral, -10 nach links, +10 nach rechts gerichtet

    public Rueckspiegel(int size, int position) {
        this.size = size;
        this.position = position;
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
