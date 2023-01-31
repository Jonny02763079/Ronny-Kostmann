package at.ronny.oo.basics.geometrickFigueres;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Balu");
        c1.getArea(20);
        c1.getName();
        Rectangle r1 = new Rectangle("Blauwahl");
        r1.getArea(10, 20);
        r1.getName();
        Quader q1 = new Quader("Kampffisch");
        q1.getArea(10, 10);
        q1.getName();
        Cube cb1 = new Cube("Kampfstachel");
        cb1.getArea(20, 20);
        cb1.getName();
    }
}
