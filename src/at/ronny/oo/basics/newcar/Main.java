package at.ronny.oo.basics.newcar;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Blue", 280, 100.000, 20);
        Engine e1 = new Engine(Engine.FUEL.Benzin, 800);
        Producer p1 = new Producer("Ford", "USA");
        c1.addEngine(e1);
        c1.addProducer(p1);
        System.out.println(c1.getConusmption());
        c1.setMileage(70000);
        System.out.println(c1.getConusmption());
        System.out.println(c1.getEngine().getType());
        System.out.println(c1.getProducer().getNation());



    }
}
