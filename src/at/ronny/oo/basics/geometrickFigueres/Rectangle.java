package at.ronny.oo.basics.geometrickFigueres;

public class Rectangle{
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    public void getArea(double a, double b){
        double survaceArea = a * b;
        System.out.println("Das Reteck mit der Seitenlänge " + a + " und der Breite " + b + " hat einen Flächeninhalt von " + survaceArea);
    }

    public String getName() {
        System.out.println("Der Name ist " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
