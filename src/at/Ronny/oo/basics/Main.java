package at.Ronny.oo.basics;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car(10, 70, 30, 5, "BMW", "A1234", "Silber");
        Car c2 = new Car(7, 60, 42, 2, "Dacia", "B1234", "Blau");


        c1.brake();
        c1.honk();
        c1.turboBoost();
        c1.getRemainingRange();
        c2.brake();
        c2.honk();
        c2.turboBoost();
        c2.getRemainingRange();

    }

}
