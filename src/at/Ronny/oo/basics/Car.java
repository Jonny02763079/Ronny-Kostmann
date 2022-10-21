package at.Ronny.oo.basics;

public class Car {
    //Instanz / Gedächtnisvariablen

    public int fuelConsumption;
    public int fuelAmmount;
    public  int fuelCount;
    public int amountOfRepetitions;
    public String brand;
    public String serialNumber;
    private String color;

    //Konstrukteur
    public Car(int fuelConsumption, int fuelAmmount, int fuelCount, int amountOfRepetitions, String brand, String serialNumber, String color){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmmount = fuelAmmount;
        this.fuelCount = fuelCount;
        this.amountOfRepetitions = amountOfRepetitions;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.color = color;
    };
    //Methode
    public void brake(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if (this.fuelCount > (0.1 * this.fuelAmmount)){
            System.out.println("SuperBoostMode");
        }else {
            System.out.println("Not enough fuel to go to Superboost");
        };
    };

    public void honk(){
        for (int i = 0; i < this.amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    };

    public void getRemainingRange(){
        float result = this.fuelCount / this.fuelConsumption;
        System.out.println("Die Restweite beträg " + result + " km");
    };
}


