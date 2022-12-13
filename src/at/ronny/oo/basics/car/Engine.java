package at.ronny.oo.basics.car;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int speed;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(){
        System.out.println("the motor is running with " + this.speed + "% of the total topspeed");
    };

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setSpeed(int speed) {
        if (speed > 100){
            System.out.println("Sie fahren schon mit 100% Vollgas");
            this.speed = 100;
        } else if (speed < 1){
            System.out.println("Sie fahren schon mit 1% der gesammt möglichen Geschwindigkeit des Autos, langsamer als 1% geht nicht");
            this.speed = 1;
        } else {
            this.speed = speed;
        };
    }

    public int getSpeed() {
        return speed;
    }
}
