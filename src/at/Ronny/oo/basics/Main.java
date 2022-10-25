package at.Ronny.oo.basics;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(550, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(70, 7);
        t1.setFuelCount(5);
        e1.setSpeed(0);
        e1.drive();

    }

}
