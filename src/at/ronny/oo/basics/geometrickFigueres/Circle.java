package at.ronny.oo.basics.geometrickFigueres;

public class Circle {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public void getArea (double radius){
        double survaceArea = (radius * 2 * Math.PI);
        System.out.println("Der Flächeninhalt des Kreises mit dem Radius " + radius + " ist " + survaceArea);
    }

    public String getName() {
        System.out.println("Der Name ist " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
