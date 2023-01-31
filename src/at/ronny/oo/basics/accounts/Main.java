package at.ronny.oo.basics.accounts;

public class Main {
    public static void main(String[] args) {
        BaseAccount b1 = new BaseAccount();
        b1.insertCash(1000);
        b1.amountOfCash();
        b1.payOutCash(13000);
        b1.amountOfCash();

        CreditAccount c1 = new CreditAccount();
        c1.payOutCredit(110000);
        c1.amountofCredit();
        c1.payOutCredit(2000);
        c1.amountofCredit();
    }
}
