package at.ronny.oo.basics.accounts;

public class CreditAccount extends BaseAccount{
    private double amountofCredit;

    public void amountofCredit(){
        System.out.println("Credit zu Ihren Diensten: " + amountofCredit);
    }

    public double payOutCredit(double num){
        System.out.println("Sie haben einen Credit in der höhe von " + num + " aufgenommen");
        return this.amountofCredit -= num;
    };

}
