package at.ronny.oo.basics.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz / Gedächtnisvariablen
    private List<wheel> wheels;
    private List<Rueckspiegel> mirrors;
    private Engine engine;
    private Tank tank;
    private double fuelConsumption;
    private int fuelAmmount;
    private  double fuelCount;
    private int amountOfRepetitions;
    private String brand;
    private String serialNumber;
    private String color;
    private int amountFuelIntoMotor;

    public void addMirror (Rueckspiegel rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void addWheels (wheel driveWheel){
        this.wheels.add(driveWheel);
    }

    public List<wheel> getWheels() {
        return wheels;
    }

    public List<Rueckspiegel> getMirrors() {
        return mirrors;
    }

    public void setAmountFuelIntoMotor(int amountFuelIntoMotor) {
        this.amountFuelIntoMotor = amountFuelIntoMotor;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        if (amountOfRepetitions>10){
            this.amountOfRepetitions = 10;
            System.out.println("Sie befinden sich auf einer Hochzeit, die Polizei kommt, Sie dürfen sommit nicht mehr hupen");
        } else {
            this.amountOfRepetitions = amountOfRepetitions;
        };
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmmount(int fuelAmmount) {
        if (fuelAmmount > 100) {
            this.fuelAmmount = 100;
            System.out.println("Sie können nicht mehr als " + this.fuelAmmount + " Liter tanken");
        } else {
            this.fuelAmmount = fuelAmmount;
        };
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption > 20){
            this.fuelConsumption = 20;
        } else if (fuelConsumption < 5){
            this.fuelConsumption = 5;
        } else {
            this.fuelConsumption = fuelConsumption;
        };
    }

    public void setFuelCount(double fuelCount) {
        if (fuelCount > this.fuelAmmount){
            System.out.println("Sie können nicht mehr getankt haben als" + this.fuelAmmount);
        }else if (fuelCount < 10){
            System.out.println("Sie sollten bald Tanken");
        } else {
            this.fuelCount = fuelCount;
        };
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getAmountFuelIntoMotor() {
        return amountFuelIntoMotor;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public int getFuelAmmount() {
        return fuelAmmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelCount() {
        return fuelCount;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //Konstrukteur
    public Car(Engine engine, Tank tank, String brand, String serialNumber, String color){
        this.engine = engine;
        this.tank = tank;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
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
        double result = this.fuelCount / this.fuelConsumption;
        System.out.println("Die Restweite beträg " + result + " km");
    };

    public void details(){
        System.out.println("Das Auto hat " + this.getEngine().getHorsePower() + " PS");
    }
}


