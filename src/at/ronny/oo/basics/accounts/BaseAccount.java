package at.ronny.oo.basics.accounts;

public class BaseAccount {
    private double amountOfCash;

    public double insertCash(double num){
        if (num >= 14000){
            System.out.println("Sie können nicht mehr als 14000 einzahlen");
            num = 14000;
        }
        System.out.println("Sie haben " + num + " Geld eingezahlt");
        return this.amountOfCash += num;
    };

    public double payOutCash(double num){
        if (num >= 14000){
            System.out.println("Sie können nicht mehr als 14000 Euro aufeinmal abheben");
            num = 14000;
        } else if (num >= this.amountOfCash) {
            System.out.println("Sie können nicht mehr als Geld abheben als Sie besitzten. Saldo zu Ihren Diensten: " + this.amountOfCash);
            num = this.amountOfCash;
        }
        return this.amountOfCash -= num;
    };

    public double amountOfCash(){
        System.out.println("Ihr Saldo zu Ihren Diensten: " + amountOfCash);
        return amountOfCash;
    }
}
