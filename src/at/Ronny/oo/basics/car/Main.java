package at.Ronny.oo.basics.car;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(550, Engine.TYPE.DIESEL);
        Rueckspiegel r1 = new Rueckspiegel(100, 0);
        Rueckspiegel r2 = new Rueckspiegel(90, -40);
        wheel w1 = new wheel(wheel.manufacturer.Pirelli, 20,1);
        wheel w2 = new wheel(wheel.manufacturer.Pirelli, 20, 2);
        wheel w3 = new wheel(wheel.manufacturer.Mercedes, 21, 3);
        wheel w4 = new wheel(wheel.manufacturer.Mercedes, 21, 4);
        Tank t1 = new Tank(70, 7);
        Car c1 = new Car(e1, t1, "BMW", "Ac1234", "White");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWheels(w1);
        c1.addWheels(w2);
        c1.addWheels(w3);
        c1.addWheels(w4);
        t1.setFuelCount(5);
        e1.setSpeed(95);
        e1.drive();

        System.out.println(c1.getMirrors().get(1).getPosition());
        System.out.println(c1.getWheels().get(3).getManufacturer());
        System.out.println(c1.getWheels().get(3).getSize());
        System.out.println(c1.getWheels().get(3).getPosition());

    }

}
