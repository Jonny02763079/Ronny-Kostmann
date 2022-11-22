package at.Ronny.oo.basics.car;

public class Tank {

    private int fuelAmount;
    public int fuelCount;
    private int fuelConsumption;

    public Tank(int fuelAmount, int fuelConsumption) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelCount() {
        return fuelCount;
    }

    public void setFuelCount(int fuelCount) {
        if (fuelCount > this.fuelAmount){
            System.out.println(this.fuelAmount + " Liter ist das Maximum");
            this.fuelCount = this.fuelAmount;
        } else if (fuelCount <= this.fuelConsumption){
            System.out.println("Sie müssen  " + (this.fuelAmount - fuelCount) +  " Liter tanken");
        } else {
            this.fuelCount = fuelCount;
            System.out.println("Es befinden sich noch " + fuelCount + " Liter im Tank");
        };
    }
}
