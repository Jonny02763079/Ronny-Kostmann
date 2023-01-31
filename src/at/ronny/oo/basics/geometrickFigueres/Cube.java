package at.ronny.oo.basics.geometrickFigueres;

public class Cube extends Rectangle{

    public Cube(String name) {
        super(name);
    }

    @Override
    public void getArea(double a, double b) {
        double survaceArea = (6 * (a * b));
        System.out.println("Der Würfel mit der Seitenlänge " + a + " und der Breite " + b + " hat einen Flächeninhalt von " + survaceArea);
        //super.getArea(a, b);
    }
}
