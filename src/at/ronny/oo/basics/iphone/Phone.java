package at.ronny.oo.basics.iphone;

public class Phone {
    private String color;
    private Sim sim;
    private SDCard sdCard;
    private Camera camera;

    public Phone(String color, Sim sim, SDCard sdCard, Camera camera) {
        this.color = color;
        this.sim = sim;
        this.sdCard = sdCard;
        this.camera = camera;
    }

    public Sim getSim() {
        return sim;
    }
}
