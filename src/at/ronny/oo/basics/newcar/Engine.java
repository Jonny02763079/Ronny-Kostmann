package at.ronny.oo.basics.newcar;

public class Engine {
    public enum FUEL {Benzin, Diesel}
    private FUEL type;
    private int horspower;

    public Engine(FUEL type, int horspower) {
        this.type = type;
        this.horspower = horspower;
    }

    public FUEL getType() {
        return type;
    }

    public int getHorspower() {
        return horspower;
    }
}
